package com.example.coursef;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class htEmoticonsTest {
    @Rule
    public ActivityTestRule<htEmoticons> activityRule = new ActivityTestRule<>(htEmoticons.class);
    @Test
    public void test_login_text() {
        onView(withId(R.id.first)).perform(click());
        onView(withId(R.id.second)).perform(click());
        onView(withId(R.id.third)).perform(click());
        onView(withId(R.id.four)).perform(click());
        onView(withId(R.id.five)).perform(click());
        onView(withId(R.id.btn_login)).perform(click());
    }
    @Test
    public void test_login_text1() {
        onView(withId(R.id.btn_login)).perform(click());
    }
}