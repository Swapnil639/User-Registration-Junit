package com.bridgelabz;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner=new Scanner(System.in);

    public void firstName(){
        System.out.println("Enter First name:");
        String firstName=scanner.next();
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher=pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Not valid");
            firstName();
        }
    }
    public void lastName(){
        System.out.println("Enter Last name:");
        String lastName=scanner.next();
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher=pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Not valid");
            lastName();

        }
    }
    public void emailId(){
        System.out.println("Enter the Email Id:");
        String email=scanner.next();
        Pattern pattern=Pattern.compile("^[a-z0-9]{2,}+@[a-z]{2,}+.[a-z]{2,}$");
        Matcher matcher=pattern.matcher(email);
        if (matcher.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Not valid");
            emailId();
        }
    }
    public void mobileNumber(){
        System.out.println("Enter mobile number:");
        String mobile=scanner.next();
        Pattern pattern=Pattern.compile("^[0-9]{2,}+-[0-9]{10}$");
        Matcher matcher=pattern.matcher(mobile);
        if (matcher.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Not valid");
            mobileNumber();
        }

    }
    public void password(){
        System.out.println("Enter Password");
        String password=scanner.next();
        Pattern pattern=Pattern.compile("^[A-Za-z]{8,}$");
        Matcher matcher=pattern.matcher(password);
        if (matcher.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Not valid");
            mobileNumber();
        }
    }
    public static void main(String[] args) {
       UserRegistration userRegistration=new UserRegistration();
       userRegistration.firstName();
       userRegistration.lastName();
       userRegistration.emailId();
       userRegistration.mobileNumber();
       userRegistration.password();
    }

}
