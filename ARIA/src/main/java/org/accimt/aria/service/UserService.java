package org.accimt.aria.service;

import org.accimt.aria.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public interface UserService {

    UserDto getUserById(Long id);
    List<UserDto> getAllUsers();
    UserDto createUser(UserDto userDto);
}