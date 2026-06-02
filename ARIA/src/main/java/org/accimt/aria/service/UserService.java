package org.accimt.aria.service;

import org.accimt.aria.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public interface UserService {
    UserDto createUser(UserDto dto);
    UserDto updateUser(UserDto dto);
    UserDto getUserById(Long id);
    List<UserDto> getAllUsers();
    void deleteUserById(Long id);
}