package com.apratyay.springai.user;

import com.apratyay.springai.common.ApiResponse;
import com.apratyay.springai.user.dto.AuthResponse;
import com.apratyay.springai.user.dto.RegisterRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<AuthResponse>> register(@Valid @RequestBody RegisterRequest request) throws Exception {

        AuthResponse response = authService.register(request);

        return ResponseEntity.ok(
                ApiResponse.ok(response)
        );
    }
}
