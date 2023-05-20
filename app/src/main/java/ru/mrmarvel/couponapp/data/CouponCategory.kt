package ru.mrmarvel.couponapp.data

import java.util.Calendar
import java.util.Date

data class CouponCategory(
    val id: Int,
    var shopName: String,
    var shortName: String,
    var longName: String? = null,
    var description: String? = null,
    var image_url: String? = null,
    var best_expire_date: Date? = null,
    var price: Int? = null,
)