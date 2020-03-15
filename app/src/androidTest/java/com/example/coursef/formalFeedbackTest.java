package com.example.coursef;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class formalFeedbackTest {
    @Rule
    public ActivityTestRule<formalFeedback> activityRule = new ActivityTestRule<>(formalFeedback.class);
    @Test
    public void test_login_text() {
        onView(withId(R.id.answer1)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.answer2)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.answer3)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());
    }
    @Test
    public void test_login_text1() {
        onView(withId(R.id.answer1)).perform(typeText("The faculty can be more interactive with students"), closeSoftKeyboard());
        onView(withId(R.id.answer2)).perform(typeText("Students are focused on faculty so they listen to what they teach in class carefully"), closeSoftKeyboard());
        onView(withId(R.id.answer3)).perform(typeText("nope"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());
    }
}