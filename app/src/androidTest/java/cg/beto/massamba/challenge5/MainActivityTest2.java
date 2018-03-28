package cg.beto.massamba.challenge5;

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



public class MainActivityTest2 {

    @Rule
    public ActivityTestRule<LoginActivity> activityActivityTestRule=new ActivityTestRule<LoginActivity>(LoginActivity.class);
    private LoginActivity mainActivity=null;

    @Before
    public void setUp() throws Exception {
        mainActivity=activityActivityTestRule.getActivity();
    }

    @Test
    public  void testActivity(){

        assertNotNull(mainActivity.findViewById(R.id.tv_email));
        assertNotNull(mainActivity.findViewById(R.id.tv_password));
        assertNotNull(mainActivity.findViewById(R.id.btn_login));
        ////////////////////////////////////////////////////////////////////////////////////////////

        onView(withId(R.id.tv_email)).perform(typeText("manis@gmail.com")).toString();

        onView(withId(R.id.tv_password)).perform(typeText("gave"));

        onView(withId(R.id.btn_login)).perform(click());

        onView(withId(R.id.tv_email)).perform(clearText());

        pressBack();
    }

    @After
    public void tearDown() throws Exception {
        mainActivity=null;
    }
}
