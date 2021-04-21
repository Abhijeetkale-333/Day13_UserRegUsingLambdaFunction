package com.bridgelapz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegisterationTest {
    UserRegistration user;
    boolean result;
    String[] allEmails;

    @BeforeEach
    public void setup(){

        user = new UserRegistration();

    }

    @Test
    public void firstName_checkValidation_ture() {
        boolean result = user.checkFirstName.validate("Abhijeet");
        Assertions.assertTrue(result);

    }

    @Test
    public void firstName_checkValidate_false() {
        boolean result = user.checkLastName.validate("Abhi123");
        Assertions.assertFalse(result);
    }



    @Test
    public void lastName_checkValidation_ture() {
        boolean result = user.checkLastName.validate("Abhi");
        Assertions.assertTrue(result);


    }
    @Test
    public void lastName_CheckValidation_false(){
        boolean result = user.checkLastName.validate("Abi");
        Assertions.assertTrue(result);

    }

    @Test
    public void Email_checkValidation_True(){

        boolean result = user.checkEmail.validate("abhijeetkale786@gmail.com");
        Assertions.assertTrue(result);


    }
    @Test
    public void Email_checkValidation_False(){

        boolean result = user.checkEmail.validate("abhijeetkale786@gmail.com");
        Assertions.assertTrue(result);


    }

    @Test
    public void MobileNumber_validation_True() {

        boolean result = user.checkMobileNum.validate("91 9423628329");
        Assertions.assertTrue(result);


    }
    @Test
    public void MobileNumber_validation_False() {

        boolean result = user.checkMobileNum.validate("987654321111");
        Assertions.assertFalse(result);

    }

    @Test
    public void Password_validation_True() {

        boolean result = user.checkPassword.validate("Abhi@123");
        Assertions.assertTrue(result);

    }
    @Test
    public void Password_validation_False() {

        boolean result = user.checkPassword.validate("Abhi@@@3332");
        Assertions.assertTrue(result);

    }

    @Test

    public void All_Email_valid_True() {

        allEmails = new String[]{"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
                "abc+100@gmail.com"};

        for (String emailIDs: allEmails) {

            result = user.checkEmail.validate(emailIDs);
            System.out.println(result);
            Assertions.assertTrue(result);

        }
    }
    @Test
    public void All_Email_validation_false() {

        allEmails = new String[]{"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
                "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
                "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        for (String emailIDs: allEmails) {
            result = user.checkEmail.validate(emailIDs);
            System.out.println(result);
            Assertions.assertFalse(result);


        }
    }
}
