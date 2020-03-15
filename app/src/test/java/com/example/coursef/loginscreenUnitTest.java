package com.example.coursef;

import org.junit.Test;

import static org.junit.Assert.*;

public class loginscreenUnitTest {
    @Test
    public void Email1_CorrectEmail_True() {
        assertTrue(loginscreen.isEmailValid("name123@gmail.com"));
    }

    @Test
    public void Email1_InvalidNoTld_False() {
        assertFalse(loginscreen.isEmailValid("name@email"));
    }

    @Test
    public void Email1_InvalidDoubleDot_False() {
        assertFalse(loginscreen.isEmailValid("name@email..com"));
    }

    @Test
    public void Email1_NoUsername_False() {
        assertFalse(loginscreen.isEmailValid("@email.com"));
    }

    @Test
    public void Email1_EmptyString_False() {

        assertFalse(loginscreen.isEmailValid(""));
    }

    @Test
    public void Pwd1_EmptyString_False() {
        assertFalse(loginscreen.isPassValid(""));
    }

    @Test
    public void Pwd1_String_short_len_False() {
        assertFalse(loginscreen.isPassValid("aBcDeFg"));
    }

    @Test
    public void Pwd1_EmptyString_crt_len_True() {
        assertTrue(loginscreen.isPassValid("Qwerty1234"));
    }
}