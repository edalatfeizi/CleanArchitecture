package com.edalatfeizi.cleanarchitecture.presentation;

import com.edalatfeizi.cleanarchitecture.presentation.util.EmailValidator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the EmailValidator logic
 */
public class EmailValidatorTest
{
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue(){
        Assert.assertTrue("Correct email simple.",EmailValidator.isValidEmail("name@email.com"));
    }

    @Test
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue(){
        Assert.assertTrue("Correct email sub domain.",EmailValidator.isValidEmail("name@email.co.uk"));
    }

    @Test
    public void emailValidator_InvalidEmailNoTld_ReturnsFalse(){
        Assert.assertFalse("invalid email with no domain extension.",EmailValidator.isValidEmail("name@email"));
    }

    @Test
    public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse(){
        Assert.assertFalse("invalid email with double dot.",EmailValidator.isValidEmail("name@email..com"));
    }

    @Test
    public void emailValidator_InvalidEmailNoUserName_ReturnsFalse(){
        Assert.assertFalse("invalid email with no user name",EmailValidator.isValidEmail("@email.com"));
    }

    @Test
    public void emailValidator_EmptyString_ReturnsFalse(){
        Assert.assertFalse("Empty string email address",EmailValidator.isValidEmail(""));
    }

    @Test
    public void emailValidator_NullEmail_ReturnsFalse(){
        Assert.assertFalse("Null email address",EmailValidator.isValidEmail(null));
    }
}
