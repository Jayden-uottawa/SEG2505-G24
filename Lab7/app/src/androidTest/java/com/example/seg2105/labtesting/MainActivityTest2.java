package com.example.seg2105.labtesting;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest2 {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void emailIsInvalid(){
        onView(withId(R.id.username)).perform(typeText("user"), closeSoftKeyboard());
    }
}
