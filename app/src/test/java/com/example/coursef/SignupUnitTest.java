package com.example.coursef;

import org.junit.Test;

import static org.junit.Assert.*;

public class SignupUnitTest {
    @Test
    public void Email_CorrectEmail_True() {
        assertTrue(Signup.isEmailValid("name123@gmail.com"));
    }

    @Test
    public void Email_InvalidNoTld_False() {
        assertFalse(Signup.isEmailValid("name@email"));
    }

    @Test
    public void Email_InvalidDoubleDot_False() {
        assertFalse(Signup.isEmailValid("name@email..com"));
    }

    @Test
    public void Email_NoUsername_False() {
        assertFalse(Signup.isEmailValid("@email.com"));
    }

    @Test
    public void Email_EmptyString_False() {

        assertFalse(Signup.isEmailValid(""));
    }

    @Test
    public void Pwd_EmptyString_False() {
        assertFalse(Signup.isPassValid(""));
    }

    @Test
    public void Pwd_EmptyStringshortlen_False() {
        assertFalse(Signup.isPassValid("abcdefg"));
    }

    @Test
    public void Pwd_EmptyStringcrtlen_True() {
        assertTrue(Signup.isPassValid("Qwerty1234"));
    }

    @Test
    public void phn_EmptyString_False() {
        assertFalse(Signup.isPnumValid(""));
    }
    @Test
    public void Phn_String_len_False() {
        assertFalse(Signup.isPnumValid("987654321"));
    }
    @Test
    public void Phn_String_crt_len_True() {
        assertTrue(Signup.isPnumValid("9876543219"));
    }

    @Test
    public void name_String_crt_True() {
        assertTrue(Signup.isnamevalid("HariKrishnan"));
    }
    @Test
    public void name_String_mixed_False() {
        assertFalse(Signup.isnamevalid("Kv123"));
    }
    @Test
    public void name_String_num_False() {
        assertFalse(Signup.isnamevalid("12345"));
    }
    @Test
    public void name_String_empty_False() {
        assertFalse(Signup.isnamevalid(""));
    }

}