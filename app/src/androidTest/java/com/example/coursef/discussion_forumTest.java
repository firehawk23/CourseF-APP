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

public class discussion_forumTest {
    @Rule
    public ActivityTestRule<discussion_forum> activityRule = new ActivityTestRule<>(discussion_forum.class);
    @Test
    public void test_btn() {
        onView(withId(R.id.fab)).perform(click());
    }

}