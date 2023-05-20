package ru.mrmarvel.couponapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ru.mrmarvel.couponapp.ui.HotSection
import ru.mrmarvel.couponapp.viewmodels.SharedViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShopScreen(
    // shopScreenState:
    sharedViewModel: SharedViewModel
) {
    Surface(
        Modifier
            .fillMaxSize()
            .background(color = Color.Black)) {
        Scaffold(floatingActionButton = {
            FloatingActionButton(onClick = {  }) {
                Icon(Icons.Filled.Add,"")
            }
        }) { padding ->
            Column (Modifier.padding(padding)) {
                HotSection()
            }
        }
    }
}

@Preview
@Composable
fun ShopScreenView() {
    ShopScreen(sharedViewModel = SharedViewModel())
}