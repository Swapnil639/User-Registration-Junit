package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();
    @Test
    public void testFirstNameValidation(){
        boolean b1=userRegistration.firstNameValidation("Swapnil");
        boolean b2=userRegistration.firstNameValidation("swapnil");
        Assertions.assertTrue(b1);
        Assertions.assertFalse(b2);
    }
    @Test
    public void testLastNameValidation(){
        boolean b1=userRegistration.lastNameValidation("Patil");
        boolean b2=userRegistration.lastNameValidation("patil");
        Assertions.assertTrue(b1);
        Assertions.assertFalse(b2);
    }
    @Test
    public void testEmailIdValidation(){
        boolean b1=userRegistration.emailIdValidation("swapnilpatil631997@gmail.com");
        boolean b2=userRegistration.emailIdValidation(".SwapnilPatilgmail123");
        Assertions.assertTrue(b1);
        Assertions.assertFalse(b2);
    }
    @Test
    public void testMobileNumberValidation(){
        boolean b1=userRegistration.mobileNumberValidation("91-9967891679");
        boolean b2=userRegistration.mobileNumberValidation("95589454");
        Assertions.assertTrue(b1);
        Assertions.assertFalse(b2);
    }
    @Test
    public void testPasswordValidation(){
        boolean b1=userRegistration.passwordValidation("SwapnilPatil@123");
        boolean b2=userRegistration.passwordValidation("swapnil");
        Assertions.assertTrue(b1);
        Assertions.assertFalse(b2);
    }
}
