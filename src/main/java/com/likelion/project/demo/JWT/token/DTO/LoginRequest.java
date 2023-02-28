package com.likelion.project.demo.JWT.token.DTO;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
