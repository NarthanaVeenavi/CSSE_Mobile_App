package com.example.csse;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegisterActivityTest {

    @Rule
    public ActivityTestRule<RegisterActivity> registerActivityTestRule = new ActivityTestRule<RegisterActivity>(RegisterActivity.class);
    private RegisterActivity registerActivity = null;

    @Before
    public void setUp() throws Exception {
        registerActivity = registerActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch(){
        View view = registerActivity.findViewById(R.id.register_username_input);
        Assert.assertNotNull(view);

    }

    @Test
    public void testLaunch1(){
        View view = registerActivity.findViewById(R.id.register_phone_input);
        Assert.assertNotNull(view);

    }

    @Test
    public void testLaunch2(){
        View view = registerActivity.findViewById(R.id.register_password_input);
        Assert.assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {
        registerActivity = null ;

    }


}