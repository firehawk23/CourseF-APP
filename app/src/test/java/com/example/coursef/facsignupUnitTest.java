package com.example.coursef;

import org.junit.Test;

import static org.junit.Assert.*;

public class facsignupUnitTest {
    @Test
    public void Email2_CorrectEmail_True() {
        assertTrue(facsignup.isEmailValid("name123@gmail.com"));
    }

    @Test
    public void Email2_InvalidNoTld_False() {
        assertFalse(facsignup.isEmailValid("name@email"));
    }

    @Test
    public void Email2_InvalidDoubleDot_False() {
        assertFalse(facsignup.isEmailValid("name@email..com"));
    }

    @Test
    public void Email2_NoUsername_False() {
        assertFalse(facsignup.isEmailValid("@email.com"));
    }

    @Test
    public void Email2_EmptyString_False() {

        assertFalse(facsignup.isEmailValid(""));
    }

    @Test
    public void Pwd2_EmptyString_False() {
        assertFalse(facsignup.isPassValid(""));
    }

    @Test
    public void Pwd2_EmptyStringshortlen_False() {
        assertFalse(facsignup.isPassValid("abcdefg"));
    }

    @Test
    public void Pwd2_EmptyStringcrtlen_True() {
        assertTrue(facsignup.isPassValid("Qwerty1234"));
    }

    @Test
    public void phn1_EmptyString_False() {
        assertFalse(facsignup.isPnumValid(""));
    }
    @Test
    public void Phn1_String_len_False() {
        assertFalse(facsignup.isPnumValid("987654321"));
    }
    @Test
    public void Phn1_String_crt_len_True() {
        assertTrue(facsignup.isPnumValid("9876543219"));
    }

    @Test
    public void name1_String_crt_True() {
        assertTrue(facsignup.isnamevalid("KIRan"));
    }
    @Test
    public void name1_String_mixed_False() {
        assertFalse(facsignup.isnamevalid("Katy123"));
    }
    @Test
    public void name1_String_num_False() {
        assertFalse(facsignup.isnamevalid("12345"));
    }
    @Test
    public void name1_String_empty_False() {
        assertFalse(facsignup.isnamevalid(""));
    }
}