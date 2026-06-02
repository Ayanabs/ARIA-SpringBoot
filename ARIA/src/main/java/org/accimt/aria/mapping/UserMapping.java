package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.UserDto;
import org.accimt.aria.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public UserDto toDto(User entity) {
        if (entity == null) {
            return null;
        }

        UserDto dto = objectMapper.convertValue(entity, UserDto.class);

        if (entity.getPhone() != null) {
            dto.setPhone(String.format("%010d", entity.getPhone()));
        }

        if (entity.getRole() != null) {
            dto.setRole(entity.getRole());
        }

        return dto;
    }

    public User mapToEntity(UserDto dto) {
        if (dto == null) {
            return null;
        }

        User entity = objectMapper.convertValue(dto, User.class);

        if (dto.getPhone() != null && !dto.getPhone().isBlank()) {
            try {
                entity.setPhone(Integer.valueOf(dto.getPhone()));
            } catch (NumberFormatException e) {

            }
        }

        if (dto.getRole() != null && !dto.getRole().isBlank()) {
            entity.setRole(dto.getRole().toUpperCase().trim());
        }

        return entity;
    }
}
