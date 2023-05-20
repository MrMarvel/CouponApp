package ru.mrmarvel.couponapp.util

import ru.mrmarvel.couponapp.MainActivity
import ru.mrmarvel.couponapp.R

public object Constants {
    const val NAV_SHOP_SCREEN = "shop"
    const val NAV_HOME_SCREEN = "home"
    val SHOP_TITLE_BUTTON = MainActivity.getAppResources()!!.getString(R.string.nav_button_shop_label)
    val HOME_TITLE_BUTTON = MainActivity.getAppResources()!!.getString(R.string.nav_button_home_label)
}