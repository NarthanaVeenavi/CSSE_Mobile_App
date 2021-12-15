package com.example.csse;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddNewProductActivityTest2 {

    @Rule
    public ActivityTestRule<AddNewProductActivity> addNewProductActivityTestRule = new ActivityTestRule<AddNewProductActivity>(AddNewProductActivity.class);
    private AddNewProductActivity addNewProductActivity = null;

    @Before
    public void setUp() throws Exception {
        addNewProductActivity = addNewProductActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch(){
        View view = addNewProductActivity.findViewById(R.id.product_name);
        Assert.assertNotNull(view);

    }

    @Test
    public void testLaunch1(){
        View view = addNewProductActivity.findViewById(R.id.product_description);
        Assert.assertNotNull(view);

    }

    @Test
    public void testLaunch2(){
        View view = addNewProductActivity.findViewById(R.id.product_price);
        Assert.assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {
        addNewProductActivity = null ;

    }

}