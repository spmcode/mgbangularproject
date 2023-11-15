package com.mgb.jwtauth.auth;

import com.mgb.jwtauth.model.Role;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class RegisterRequest {
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private Role role;
}
