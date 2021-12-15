package com.example.csse;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminMaintainProductsActivityTest {

    @Rule
    public ActivityTestRule<AdminMaintainProductsActivity> adminMaintainProductsActivityActivityTestRule = new ActivityTestRule<AdminMaintainProductsActivity>(AdminMaintainProductsActivity.class);
    private AdminMaintainProductsActivity adminMaintainProductsActivity = null;

    @Before
    public void setUp() throws Exception {
        adminMaintainProductsActivity = adminMaintainProductsActivityActivityTestRule .getActivity();

    }

    @Test
    public void testLaunch(){
        View view = adminMaintainProductsActivity.findViewById(R.id.product_name_maintain);
        Assert.assertNotNull(view);

    }

    @Test
    public void testLaunch1(){
        View view = adminMaintainProductsActivity.findViewById(R.id.product_price_maintain);
        Assert.assertNotNull(view);

    }

    @Test
    public void testLaunch2(){
        View view = adminMaintainProductsActivity.findViewById(R.id.product_description_maintain);
        Assert.assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {
        adminMaintainProductsActivity = null ;

    }

}