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
        }
    }
    public static void main(String[] args) {
       UserRegistration userRegistration=new UserRegistration();
       userRegistration.firstName();
       userRegistration.lastName();
       userRegistration.emailId();
    }

}
