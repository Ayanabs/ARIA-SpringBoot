package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.UserDto;
import org.accimt.aria.entity.User;
import org.accimt.aria.mapping.UserMapping;
import org.accimt.aria.repository.UserRepository;
import org.accimt.aria.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapping userMapping;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDto createUser(UserDto dto) {
        User entity = userMapping.mapToEntity(dto);
        entity.setPassword(passwordEncoder.encode(dto.getPassword()));
        entity.setCreatedAt(LocalDateTime.now());
        User savedUser = userRepository.save(entity);
        return userMapping.toDto(savedUser);
    }

    @Override
    public UserDto updateUser(UserDto dto) {
        User existingUser = userRepository.findById(dto.getId())
                .orElseThrow(() -> new RuntimeException("User not found with id: " + dto.getId()));

        if (dto.getFname() != null) existingUser.setFname(dto.getFname());
        if (dto.getSurname() != null) existingUser.setSurname(dto.getSurname());
        if (dto.getEmail() != null) existingUser.setEmail(dto.getEmail());
        if (dto.getPassword() != null && !dto.getPassword().isBlank()) {
            existingUser.setPassword(passwordEncoder.encode(dto.getPassword()));
        }

        if (dto.getPhone() != null && !dto.getPhone().isBlank()) {
            try {
                existingUser.setPhone(Integer.valueOf(dto.getPhone()));
            } catch (NumberFormatException e) {

            }
        }

        if (dto.getRole() != null && !dto.getRole().isBlank()) {
            existingUser.setRole(dto.getRole().toUpperCase().trim());
        }

        User updatedUser = userRepository.save(existingUser);
        return userMapping.toDto(updatedUser);
    }

    @Override
    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return userMapping.toDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapping::toDto)
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}

