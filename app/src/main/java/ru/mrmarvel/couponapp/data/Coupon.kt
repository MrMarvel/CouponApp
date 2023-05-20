package ru.mrmarvel.couponapp.data

import androidx.room.Entity
import java.util.Date

@Entity
data class Coupon (
    val id: ULong,
    var category: CouponCategory,
    var content: String,
    var expiring_date: Date?,
    var added_by: User,
var owned_by: User,
)
