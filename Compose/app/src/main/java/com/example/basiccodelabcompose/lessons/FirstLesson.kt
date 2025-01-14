package com.example.basiccodelabcompose.lessons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.basiccodelabcompose.components.molecule.GreetingList
import com.example.basiccodelabcompose.components.organism.OnboardingScreen

@Composable
fun FirstLesson() {
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }

    if (shouldShowOnboarding) {
        OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false })
    } else {
        GreetingList()
    }
}