package com.example.myorder.services;

import com.example.myorder.api.dtos.CreateUserDto;
import com.example.myorder.api.mappers.UserMapper;
import com.example.myorder.enties.User;
import com.example.myorder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void create(CreateUserDto createUserDto) {
        saveUser(UserMapper.toEntity(createUserDto));
    }

    private void validateUserEmail(String email) {

    }

    private User saveUser(User user){
        return userRepository.save(user);
    }
}
