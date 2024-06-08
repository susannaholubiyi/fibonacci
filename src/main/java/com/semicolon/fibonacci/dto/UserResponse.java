package com.semicolon.fibonacci.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class UserResponse {
    private String message;
    private boolean success;
}
