package com.apratyay.springai.user;

import java.util.Set;

public final class CommonPasswords {

    public static final Set<String> LIST = Set.of(

            // Common passwords
            "password123",
            "password1234",
            "password12345",
            "password2024",
            "password2025",
            "password2026",
            "Password123",
            "Password1234",
            "Password@123",
            "Password@1234",
            "Passw0rd123",
            "P@ssw0rd123",

            // Numeric passwords
            "1234567890",
            "12345678910",
            "123456789012",
            "1111111111",
            "0000000000",
            "1231231231",
            "1212121212",
            "1122334455",
            "9876543210",

            // Keyboard patterns
            "qwertyuiop",
            "qwerty12345",
            "qwerty123456",
            "asdfghjkl123",
            "zxcvbnm1234",
            "qwertyasdf",
            "qwertyui123",
            "1q2w3e4r5t",
            "1q2w3e4r5t6",
            "q1w2e3r4t5",

            // Common words and phrases
            "iloveyou123",
            "iloveyou2024",
            "iloveyou2025",
            "iloveyou2026",
            "welcome1234",
            "welcome12345",
            "welcome2024",
            "welcome2025",
            "welcome2026",
            "letmein1234",
            "letmein12345",
            "admin123456",
            "administrator",
            "administrator123",
            "changeme123",
            "changeme1234",
            "secret12345",
            "trustno123",
            "master12345",
            "monkey12345",
            "football123",
            "football1234",
            "baseball123",
            "sunshine123",
            "princess123",
            "superman123",
            "dragon12345",
            "shadow12345",
            "freedom1234",
            "whatever123",
            "computer123",
            "internet123",
            "starwars123",
            "login123456",
            "guest123456",
            "user1234567",
            "test1234567",

            // Common date-based passwords
            "January2025",
            "January2026",
            "February2025",
            "February2026",
            "December2025",
            "December2026",

            // India-specific common passwords
            "india123456",
            "india@12345",
            "bharat12345",
            "indian123456",
            "hindustan123",
            "welcomeindia",
            "india@2025",
            "india@2026"
    );

    private CommonPasswords() {
        // Prevent instantiation
    }
}