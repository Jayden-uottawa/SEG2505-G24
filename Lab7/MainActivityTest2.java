package com.example.seg2105.labtesting;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest2 {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =new ActivityTestRule<>(MainActivity.class);
    @Test
    public void emailIsInvalid(){
        onView(withId(R.id.username)).perform(typeText("user"),closeSoftKeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("test"),closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("email@"),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("admin"),closeSoftKeyboard());
        onView(withId(R.id.loginBtn)).perform(click());
        onView(withText("Invalid Email")).check(matches(isDisplayed()));
    }

    @Test
    public void passwordIsInvalid(){
        onView(withId(R.id.username)).perform(typeText("user"),closeSoftKeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("test"),closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("email@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("admin2"),closeSoftKeyboard());
        onView(withId(R.id.loginBtn)).perform(click());
        onView(withText("Invalid Password")).check(matches(isDisplayed()));
    }

    @Test
    public void usernameIsInvalid(){
        onView(withId(R.id.username)).perform(typeText("user2"),closeSoftKeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("test"),closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("email@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("admin"),closeSoftKeyboard());
        onView(withId(R.id.loginBtn)).perform(click());
        onView(withText("Invalid First Name")).check(matches(isDisplayed()));
    }

    @Test
    public void LastnameIsInvalid(){
        onView(withId(R.id.username)).perform(typeText("user"),closeSoftKeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("test2"),closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("email@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("admin"),closeSoftKeyboard());
        onView(withId(R.id.loginBtn)).perform(click());
        onView(withText("Invalid Last Name")).check(matches(isDisplayed()));
    }

    @Test
    public void loginIsValid(){
        onView(withId(R.id.username)).perform(typeText("user"),closeSoftKeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("test"),closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("email@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("admin"),closeSoftKeyboard());
        onView(withId(R.id.loginBtn)).perform(click());
        onView(withText("Login Successful")).check(matches(isDisplayed()));
    }




}





