package com.example.csse;

import android.content.Intent;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.action.ViewActions.click;
import static org.junit.Assert.*;

public class LoginActivityTest {

    @Rule

    public ActivityTestRule<LoginActivity> activityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void testIntent2Login(){
        onView(withId(R.id.login_btn)).perform(click());
        Intent i = new Intent();
        activityTestRule.launchActivity(i);
    }

}