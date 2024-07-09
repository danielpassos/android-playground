package me.passos.android.playground

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class GreetingTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testGretting() {
        composeTestRule.setContent {
            Greeting("Daniel")
        }

        composeTestRule.onNodeWithText("Hello Daniel!").assertExists()
    }

}