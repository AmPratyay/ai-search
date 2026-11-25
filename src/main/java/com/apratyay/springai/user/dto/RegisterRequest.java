package com.apratyay.springai.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Size(min = 10, max = 20, message = "Password at least 10 character")
        String password,

        @NotBlank
        String fullName) {
}
