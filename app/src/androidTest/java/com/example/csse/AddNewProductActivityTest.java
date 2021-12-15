package com.example.csse;

import android.content.Intent;
import android.view.View;

import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.rule.ActivityTestRule;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static org.junit.Assert.*;

public class AddNewProductActivityTest{

    @Rule

    public ActivityTestRule<AddNewProductActivity> activityTestRule = new ActivityTestRule<>(AddNewProductActivity.class);

    @Test
    public void testIntentAddNewProduct(){
        onView(withId(R.id.add_new_product)).perform(click());
        Intent i = new Intent();
        activityTestRule.launchActivity(i);
    }

}