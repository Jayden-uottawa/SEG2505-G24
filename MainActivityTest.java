package com.example.seg2105.labtesting;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import android.support.test.annotation.UiThreadTest;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity = null;
    private TextView text;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }

    @Test
    @UiThreadTest
    public void checkFirstName() {
        assertNotNull(mActivity.findViewById(R.id.textView1));
        text = mActivity.findViewById(R.id.username);
        text.setText("user1");
        String name = text.getText().toString();
        assertNotEquals("user", name);
    }


    @Test
    @UiThreadTest
    public void checkEmailId() {
        assertNotNull(mActivity.findViewById(R.id.textView1));
        text = mActivity.findViewById(R.id.email);
        text.setText("@gmail.com");
        String email = text.getText().toString();
        assertNotEquals("email@gmail.com", email);
    }


    @Test
    @UiThreadTest
    public void checkPassword() {
        assertNotNull(mActivity.findViewById(R.id.textView1));
        text = mActivity.findViewById(R.id.password);
        text.setText("admin1");
        String password = text.getText().toString();
        assertNotEquals("admin", password);
    }
}
