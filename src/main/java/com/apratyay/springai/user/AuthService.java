package com.apratyay.springai.user;

import com.apratyay.springai.user.dto.AuthResponse;
import com.apratyay.springai.user.dto.RegisterRequest;
import com.apratyay.springai.user.dto.UserResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    @Transactional
    public AuthResponse register(RegisterRequest request) throws Exception {

        String email = request.email().trim().toLowerCase();

        if (userRepository.existsByEmail(email)) {
            throw new Exception("Account already exists! ");
        }

        if (CommonPasswords.LIST.contains(request.password().toLowerCase())) {
            throw new Exception("Very common password - Choose another password");
        }

        User user = User.register(request.email(), request.password(), request.fullName());

        user = userRepository.save(user);

        return toAuthResponse(user);
    }

    private AuthResponse toAuthResponse(User user) {
        return new AuthResponse("Dummy access token", UserResponse.from(user));
    }
}