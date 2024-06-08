package com.semicolon.fibonacci;



import com.semicolon.fibonacci.data.repositories.UserRepository;
import com.semicolon.fibonacci.dto.UserRequest;
import com.semicolon.fibonacci.dto.UserResponse;
import com.semicolon.fibonacci.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;
    @Test
    void registerUser() {
        UserRequest userRequest = new UserRequest();
        userRequest.setFirstName("test");
        userRequest.setLastName("user");
        userRequest.setEmail("test@email.com");

        UserResponse response = userService.register(userRequest);
        assertTrue(response.isSuccess());

    }
}
