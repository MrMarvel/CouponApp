package ru.mrmarvel.couponapp

import android.content.res.Resources
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.navigation.compose.rememberNavController
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.mrmarvel.couponapp.ui.HotSection
import ru.mrmarvel.couponapp.ui.TopSearchBar
import ru.mrmarvel.couponapp.ui.theme.CouponAppTheme
import ru.mrmarvel.couponapp.viewmodels.SharedViewModel

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun changeSearchText() {
        composeTestRule.setContent {
            MainResources.pv_resources = Resources.getSystem()
            CouponAppTheme {
                TopSearchBar()
            }
        }
        val node = composeTestRule.onNodeWithText("Найти купон...")
        node.performClick().performTextInput("Тест")
        composeTestRule.onNodeWithText("Тест").assertIsDisplayed()
    }
    @Test
    fun checkCard() {
        composeTestRule.setContent {
            MainResources.pv_resources = Resources.getSystem()
            CouponAppTheme {
                HotSection()
            }
        }
        val node = composeTestRule.onNodeWithText("-15%")
        node.performClick().assertIsDisplayed()
    }
}