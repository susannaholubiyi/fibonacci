package com.semicolon.fibonacci.services;

import com.semicolon.fibonacci.dto.UserRequest;
import com.semicolon.fibonacci.dto.UserResponse;

public interface UserService {

    public UserResponse register(UserRequest userRequest);
    public long calculateFibonacci(int number);
}
