package com.ijse.possystembackend.service;

import com.ijse.possystembackend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();
    User createUser(User user);
    User getUserById(Long id);
}
