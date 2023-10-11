package com.bridgelabz;

import java.util.regex.Matcher;
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

    public boolean validEmail(String email){
        Pattern pattern = Pattern.compile("^[a-z]{3}@[a-z]{2,}.[a-z]{3,}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z]{3}-[0-9]{3}@[a-z]{3,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

        pattern = Pattern.compile("^[a-z]{3}.[0-9]{3}@[a-z]{3,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z0-9]{2,}@[a-z]{3}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z]{2,}-[0-9]{2,}@[a-z]{2,}.[a-z]{2,}");
        matcher= pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z]{3}.[0-9]{3}@[a-z]{3}.[a-z]{3}.[a-z]{2}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

        pattern = Pattern.compile("^[a-z]{3}@[a-z]{2,}.[a-z]{3}.[a-z]{3}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("[a-z]{3,}[+]\\d{2,}@[a-z]{2,}.[a-z]{3,}");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z]{2,}@[0-9]{1,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

        return false;
    }

}
