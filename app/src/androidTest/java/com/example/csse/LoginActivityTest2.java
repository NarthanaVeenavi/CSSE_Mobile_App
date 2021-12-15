package com.example.csse;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginActivityTest2 {

    @Rule
    public ActivityTestRule<LoginActivity> loginActivityActivityTestRule = new ActivityTestRule<LoginActivity>(LoginActivity.class);
    private LoginActivity loginActivity = null;

    @Before
    public void setUp() throws Exception {
        loginActivity = loginActivityActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch(){
        View view = loginActivity.findViewById(R.id.login_phone_number_input);
        Assert.assertNotNull(view);

    }

    @Test
    public void testLaunch1(){
        View view = loginActivity.findViewById(R.id.login_password_input);
        Assert.assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {
        loginActivity = null ;

    }

}