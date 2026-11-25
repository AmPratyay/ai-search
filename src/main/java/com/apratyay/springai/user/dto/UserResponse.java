package com.apratyay.springai.user.dto;

import com.apratyay.springai.user.User;

import java.time.Instant;
import java.util.UUID;

public record UserResponse(
        UUID id,
        String email,
        String fullName,
        String role,
        boolean emailVerified,
        Instant createdAt
) {

    public static UserResponse from(User user) {
        return new UserResponse(user.getId(),
                user.getEmail(),
                user.getFullName(),
                user.getRole().name(),
                user.isEmailVerified(),
                user.getCreatedAt());
    }
}
