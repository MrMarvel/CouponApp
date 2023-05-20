package ru.mrmarvel.couponapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import ru.mrmarvel.couponapp.navigation.destinations.homeScreen
import ru.mrmarvel.couponapp.navigation.destinations.shopScreen
import ru.mrmarvel.couponapp.util.Constants.NAV_SHOP_SCREEN
import ru.mrmarvel.couponapp.viewmodels.SharedViewModel

@Composable
fun SetupNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NAV_SHOP_SCREEN) {
        shopScreen(
            sharedViewModel = sharedViewModel
        )
        homeScreen(sharedViewModel)
    }
}
@Preview
@Composable
fun SetupNavigationPreview() {
    SetupNavigation(navController = rememberNavController(), sharedViewModel = SharedViewModel())
}