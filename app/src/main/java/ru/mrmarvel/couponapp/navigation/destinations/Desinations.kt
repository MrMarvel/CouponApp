package ru.mrmarvel.couponapp.navigation.destinations

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ru.mrmarvel.couponapp.data.models.CouponCategory
import ru.mrmarvel.couponapp.screens.CouponCategoryScreen
import ru.mrmarvel.couponapp.screens.ShopScreen
import ru.mrmarvel.couponapp.util.Constants
import ru.mrmarvel.couponapp.viewmodels.SharedViewModel


fun NavGraphBuilder.shopScreen (
    navigateToCouponCategoryScreen: (CouponCategory) -> Unit,
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
        Surface(Modifier.fillMaxSize()) {
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Купленные купоны")
            }
        }
    }
}

fun NavGraphBuilder.couponCategoryScreen (
    sharedViewModel: SharedViewModel
) {
    composable(
        route = Constants.NAV_COUPON_CATEGORY_SCREEN,
        arguments = listOf(navArgument(Constants.NAV_COUPON_CATEGORY_SCREEN){
            type = NavType.IntType
        }),
    ) { navBackStackEntry ->
        val couponCategoryId = navBackStackEntry.arguments!!.getInt(Constants.NAV_COUPON_CATEGORY_SCREEN)
        LaunchedEffect(key1 = couponCategoryId) {
            sharedViewModel.getSelectedCouponCategory(couponCategoryId = couponCategoryId)
        }
        // CouponCategoryScreen(couponCategory = , sharedViewModel = )
    }
}