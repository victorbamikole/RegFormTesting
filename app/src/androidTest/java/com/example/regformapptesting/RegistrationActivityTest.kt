package com.example.regformapptesting

import android.provider.AlarmClock.EXTRA_MESSAGE
import android.provider.ContactsContract.Directory.PACKAGE_NAME
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.clearText
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.`is`

import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.core.AllOf.allOf
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class RegistrationActivityTest {

    val fullName = "Victor Bamikole"
    val email = "victor@gmail.com"
    val phoneNumber = "09033017453"

    val fullName2 = " "
    val email2 = "garry"
    val phonNumber2 = "8234567892"

    @get:Rule
    val activityRule = ActivityScenarioRule(RegistrationActivity::class.java)

    @Test
    fun registrationFormValid() {
        Espresso.onView(withId(R.id.userName))
            .perform(ViewActions.typeText(fullName), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonReg)).perform(click())
        Espresso.onView((withId(R.id.textView4)))




        Espresso.onView(withId(R.id.eMail))
            .perform(ViewActions.typeText(email), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonReg)).perform(click())
        Espresso.onView((withId(R.id.textView4)))

        Espresso.onView(withId(R.id.pNumber))
            .perform(ViewActions.typeText(phoneNumber), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonReg)).perform(click())
        Espresso.onView((withId(R.id.textView4)))

        Espresso.onView(withId(R.id.genderDropDown)).perform(click());
        onData(allOf(`is`(instanceOf(String::class.java)), `is`("Female"))).perform(click())

    }

    @Test
    fun registrationFormInValid() {
        Espresso.onView(withId(R.id.userName))
            .perform(ViewActions.typeText(fullName2), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonReg)).perform(click())
    //    Espresso.onView((withId(R.id.textView4)))

        Espresso.onView(withId(R.id.userName))
            .perform(ViewActions.typeText(email2), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonReg)).perform(click())
    //    Espresso.onView((withId(R.id.textView4)))

        Espresso.onView(withId(R.id.userName))
            .perform(ViewActions.typeText(phonNumber2), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonReg)).perform(click())
    //    Espresso.onView((withId(R.id.textView4)))

        Espresso.onView(withId(R.id.userName))
            .perform(clearText())
            .perform(ViewActions.typeText(fullName), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonReg)).perform(click())
        Espresso.onView((withId(R.id.textView4)))




        Espresso.onView(withId(R.id.eMail))
            .perform(ViewActions.typeText(email), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonReg)).perform(click())
        Espresso.onView((withId(R.id.textView4)))

        Espresso.onView(withId(R.id.pNumber))
            .perform(ViewActions.typeText(phoneNumber), ViewActions.closeSoftKeyboard())
//        Espresso.onView(withId(R.id.buttonReg)).perform(click())
//        Espresso.onView((withId(R.id.textView4)))

        Espresso.onView(withId(R.id.genderDropDown)).perform(click());
        onData(allOf(`is`(instanceOf(String::class.java)), `is`("Female"))).perform(click())

        Espresso.onView(withId(R.id.buttonReg)).perform(click())

    }
}