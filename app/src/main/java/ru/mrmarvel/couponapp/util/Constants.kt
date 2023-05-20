package ru.mrmarvel.couponapp.util

import ru.mrmarvel.couponapp.MainActivity
import ru.mrmarvel.couponapp.MainResources
import ru.mrmarvel.couponapp.R

public object Constants {
    const val NAV_SHOP_SCREEN = "shop"
    const val NAV_HOME_SCREEN = "home"
    const val NAV_COUPON_CATEGORY_ARGUMENT = "id"
    const val NAV_COUPON_CATEGORY_SCREEN = "coupon_category/{id}"
    val SHOP_TITLE_BUTTON = MainResources.getAppResources()?.getString(R.string.nav_button_shop_label) ?: "Shop"
    val HOME_TITLE_BUTTON = MainResources.getAppResources()?.getString(R.string.nav_button_home_label) ?: "Home"
}