package com.semicolon.fibonacci.services;

import com.semicolon.fibonacci.data.models.User;
import com.semicolon.fibonacci.data.repositories.UserRepository;
import com.semicolon.fibonacci.dto.UserRequest;
import com.semicolon.fibonacci.dto.UserResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserResponse register(UserRequest userRequest) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userRequest, User.class);
        userRepository.deleteAll();
        userRepository.save(user);
//        User foundUser = userRepository.findByEmail(user.getEmail()).get();
        UserResponse response = new UserResponse();
        response.setMessage("User registered successfully");
        response.setSuccess(true);
        return response;
    }
}
