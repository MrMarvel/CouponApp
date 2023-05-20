package ru.mrmarvel.couponapp.navigation.destinations

import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ru.mrmarvel.couponapp.screens.ShopScreen
import ru.mrmarvel.couponapp.util.Constants
import ru.mrmarvel.couponapp.viewmodels.SharedViewModel


fun NavGraphBuilder.shopScreen (
    sharedViewModel: SharedViewModel
) {
    composable(
        route = Constants.NAV_SHOP_SCREEN
    ) {
        ShopScreen(sharedViewModel = sharedViewModel)
    }
}