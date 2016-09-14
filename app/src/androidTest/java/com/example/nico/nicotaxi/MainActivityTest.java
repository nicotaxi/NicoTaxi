package com.example.nico.nicotaxi;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.LayoutInflater;
import android.view.View;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import tools.fastlane.screengrab.Screengrab;
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy;
import tools.fastlane.screengrab.locale.LocaleTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by nico on 08/09/2016.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    MainActivity mainActivity;

    View view;
    /**
     * to tests class to handle automatic switching of locales
     */
    @ClassRule
    public static final LocaleTestRule localeTestRule = new LocaleTestRule();

    @Before
    public void setUp(){
        Screengrab.setDefaultScreenshotStrategy(new UiAutomatorScreenshotStrategy());
        mainActivity = mActivityRule.getActivity();
        view = LayoutInflater.from(mainActivity).inflate(R.layout.activity_main, null);
    }

    @Test
    public void testCase() {

        for (int i = 0; i < 4; i++) {
            Screengrab.screenshot("before");
            onView(withId(R.id.btnAct)).perform(click());
//            Screengrab.screenshot("after");
        }


//        class Qqqq implements Qqq {
//            @Override
//            public String toString() {
//                onView(withId(R.id.btnAct)).perform(click());
//
//                return "WOWOWOWOWOWOWO";
//            }
//        }
//        activity.setQqq(new Qqqq());


    }
}
