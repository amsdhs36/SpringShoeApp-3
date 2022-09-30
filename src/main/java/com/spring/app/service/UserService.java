package com.spring.app.service;

import java.util.List;

import com.spring.app.dto.UserDto;
import com.spring.app.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}