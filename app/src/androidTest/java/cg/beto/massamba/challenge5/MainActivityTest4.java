package cg.beto.massamba.challenge5;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.openLinkWithText;
import static android.support.test.espresso.action.ViewActions.pressBack;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by MASSAMBA on 21/03/2018.
 */

public class MainActivityTest4 {

    @Rule
    public ActivityTestRule<LoginActivity> activityActivityTestRule=new ActivityTestRule<LoginActivity>(LoginActivity.class);
    private LoginActivity mainActivity=null;
    public ActivityTestRule<MainActivity> activityActivityTestRule1=new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mainActivity1=null;

    @Before
    public void setUp() throws Exception {
        mainActivity=activityActivityTestRule.getActivity();
        mainActivity1=activityActivityTestRule1.getActivity();
    }

    @Test
    public  void testActivity(){

        assertNotNull(mainActivity.findViewById(R.id.tv_email));
        assertNotNull(mainActivity.findViewById(R.id.tv_password));
        assertNotNull(mainActivity.findViewById(R.id.btn_login));
        ////////////////////////////////////////////////////////////////////////////////////////////

        onView(withId(R.id.tv_email)).perform(typeText("manisgave@gmail.com")).toString();

        onView(withId(R.id.tv_password)).perform(typeText("BETO"));

        onView(withId(R.id.btn_login)).perform(click());

        pressBack();
    }

    @After
    public void tearDown() throws Exception {
        mainActivity=null;
    }
}
