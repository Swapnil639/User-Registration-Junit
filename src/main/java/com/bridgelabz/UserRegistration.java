package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstNameValidation(String firstName) throws InvalidInputException {
        if (Pattern.matches("[A-Z][a-z]{2,}", firstName))
            return true;
        else
            throw new InvalidInputException("You enter Invalid First Name");
    }


    public boolean lastNameValidation(String lastName) throws InvalidInputException {
        if (Pattern.matches("[A-Z][a-z]{2,}", lastName))
            return true;
        else
            throw new InvalidInputException("You enter Invalid Last Name ");
    }

    public boolean emailValidation(String email) throws InvalidInputException {
        if (Pattern.matches("^[a-zA-Z\\\\d]{1,1}[a-zA-Z\\\\d+_.-]+@[a-zA-Z]+.[a-zA-z.]{2,}$", email))
            return true;
        else
            throw new InvalidInputException("You enter invalid mail");
    }

    public boolean phoneNumberValidation(String phoneNumber) throws InvalidInputException {
        if (Pattern.matches("^[0-9]{2}-[0-9]{10}$", phoneNumber))
            return true;
        else
            throw new InvalidInputException("You enter invalid Phone number");
    }


    public boolean passwordValidation(String password) throws InvalidInputException {
        if (Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", password))
            return true;
        else
            throw new InvalidInputException("You Enter invalid Password");
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
