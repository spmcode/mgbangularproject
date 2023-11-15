package com.mgb.jwtauth.auth;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class AuthResponse {
    private String jwtToken;
}
