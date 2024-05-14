package com.example.securityexample.user.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LoginRequestDto {
    private String email;
    private String password;
}
