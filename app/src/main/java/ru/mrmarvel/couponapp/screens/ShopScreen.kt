package ru.mrmarvel.couponapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ru.mrmarvel.couponapp.ui.HotSection
import ru.mrmarvel.couponapp.viewmodels.SharedViewModel

@Composable
fun ShopScreen(
    // shopScreenState:
    sharedViewModel: SharedViewModel
) {
    Surface(
        Modifier
            .fillMaxSize()
            .background(color = Color.Black)) {
        Column {
            HotSection()
        }
    }
}

@Preview
@Composable
fun ShopScreenView() {
    ShopScreen(sharedViewModel = SharedViewModel())
}