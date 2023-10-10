package com.bridgelabz;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner=new Scanner(System.in);

    public void firstName(){
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
        String lastName=scanner.next();
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher=pattern.matcher(lastName);
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
    }

}
