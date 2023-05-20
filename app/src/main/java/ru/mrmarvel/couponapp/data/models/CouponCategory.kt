package ru.mrmarvel.couponapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
@Entity(tableName = "coupon_category")
data class CouponCategory(
    @PrimaryKey
    val id: Int,
    var shopName: String,
    var shortName: String,
    var longName: String? = null,
    var description: String? = null,
    var image_url: String? = null,
    var best_expire_date: Date? = null,
    var price: Int? = null,
)