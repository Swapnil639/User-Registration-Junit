package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstNameValidation(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{3,}$",firstName);
    }

    public boolean lastNameValidation(String lastName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{3,}$",lastName);
    }

    public boolean emailIdValidation(String email) {
        return Pattern.matches("^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$",email);
    }

    public boolean mobileNumberValidation(String mobNo) {
        return Pattern.matches("^[0-9]{2,}-[0-9]{10}$",mobNo);
    }

    public boolean passwordValidation(String password) {
        return Pattern.matches("(?=.*?[A-Z])(?=.*?[!@#$^&*.])(?=.*?[0-9])([a-zA-Z\\d@*#$&,.]){8,}", password);
    }
}
