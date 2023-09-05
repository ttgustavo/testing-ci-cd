package com.gsapps.testingcicd

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.gsapps.testingcicd.ui.screens.MainScreen

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun isContentDisplayed() {
        composeTestRule.setContent {
            MainUi { MainScreen() }
        }

        composeTestRule.onNodeWithText("Hello World!").assertIsDisplayed()
        composeTestRule.onNodeWithText("Testing for CI/CD in Github").assertIsDisplayed()
    }

}