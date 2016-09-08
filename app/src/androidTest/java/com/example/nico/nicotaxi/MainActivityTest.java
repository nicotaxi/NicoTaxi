package com.example.nico.nicotaxi;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import tools.fastlane.screengrab.Screengrab;
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
    @Rule
    public ActivityTestRule<ActivityTwo> mActivityRule2 = new ActivityTestRule<>(ActivityTwo.class);
    @Rule
    public ActivityTestRule<ActivityThree> mActivityRule3 = new ActivityTestRule<>(ActivityThree.class);
    @Rule
    public ActivityTestRule<ActivityFour> mActivityRule4 = new ActivityTestRule<>(ActivityFour.class);
    @Rule
    public ActivityTestRule<ActivityFive> mActivityRule5 = new ActivityTestRule<>(ActivityFive.class);

    /**
     * to tests class to handle automatic switching of locales
     */
    @ClassRule
    public static final LocaleTestRule localeTestRule = new LocaleTestRule();

    @Test
    public void testCase() {
        /*for (int i = 0; i < 5; i++) {
            Screengrab.screenshot("R.id.btnAct");
            onView(withId(R.id.btnAct)).perform(click());
            Screengrab.screenshot("R.id.btnAct");
        }*/
        Screengrab.screenshot("activity_main");
        onView(withId(R.id.btnAct)).perform(click());
        Screengrab.screenshot("activity_main");
        Screengrab.screenshot("activity_two");
        onView(withId(R.id.btnAct)).perform(click());
        Screengrab.screenshot("activity_two");
        Screengrab.screenshot("activity_three");
        onView(withId(R.id.btnAct)).perform(click());
        Screengrab.screenshot("activity_three");
        Screengrab.screenshot("activity_four");
        onView(withId(R.id.btnAct)).perform(click());
        Screengrab.screenshot("activity_four");
        Screengrab.screenshot("activity_five");
    }
}
