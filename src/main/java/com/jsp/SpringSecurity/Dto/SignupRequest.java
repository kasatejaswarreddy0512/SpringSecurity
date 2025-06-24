package com.jsp.SpringSecurity.Dto;

import com.jsp.SpringSecurity.entity.Role;
import lombok.Data;

@Data
public class SignupRequest {

    private String name;
    private String email;
    private String password;
    private Role role;
}
