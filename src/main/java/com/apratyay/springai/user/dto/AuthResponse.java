package com.apratyay.springai.user.dto;

public record AuthResponse(
        String accessToken,
        UserResponse userResponse
) {
}
