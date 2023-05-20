package ru.mrmarvel.couponapp.navigation.destinations

import androidx.compose.material3.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ru.mrmarvel.couponapp.screens.ShopScreen
import ru.mrmarvel.couponapp.util.Constants
import ru.mrmarvel.couponapp.viewmodels.SharedViewModel


fun NavGraphBuilder.shopScreen (
    sharedViewModel: SharedViewModel
) {
    composable(
        route = Constants.NAV_SHOP_SCREEN
    ) {
        sharedViewModel.title.value = Constants.SHOP_TITLE_BUTTON
        ShopScreen(sharedViewModel = sharedViewModel)
    }
}

fun NavGraphBuilder.homeScreen (
    sharedViewModel: SharedViewModel
) {
    composable(
        route = Constants.NAV_HOME_SCREEN
    ) {
        sharedViewModel.title.value = Constants.HOME_TITLE_BUTTON
        Text("HOME")
    }
}