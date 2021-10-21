package com.example.androidstore.dto;

import lombok.Data;

@Data
public class RegisterDTO {

    private String email;
    private String firstName;
    private String secondName;
    private String phone;
    private String photo;
    private String password;
    private String сonfirmPassword;
}
