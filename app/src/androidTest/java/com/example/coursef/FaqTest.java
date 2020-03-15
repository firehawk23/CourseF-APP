package com.example.coursef;

import androidx.test.espresso.ViewAction;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class FaqTest {
    @Rule
    public ActivityTestRule<Faq> activityRule = new ActivityTestRule<>(Faq.class);
    @Test
    public void test_login_text() {

    }
}