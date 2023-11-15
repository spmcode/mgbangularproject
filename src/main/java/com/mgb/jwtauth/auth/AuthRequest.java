package com.mgb.jwtauth.auth;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class AuthRequest {
    private  String email;
    String password;
}
