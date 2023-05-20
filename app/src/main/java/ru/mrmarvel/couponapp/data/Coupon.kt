package ru.mrmarvel.couponapp.data

import java.util.Date

data class Coupon (
    val id: ULong,
    var category: CouponCategory,
    var content: String,
    var expiring_date: Date?
)
