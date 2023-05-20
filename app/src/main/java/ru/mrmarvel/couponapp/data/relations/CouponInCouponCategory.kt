package ru.mrmarvel.couponapp.data.relations

import androidx.room.Embedded
import androidx.room.Relation
import ru.mrmarvel.couponapp.data.Coupon
import ru.mrmarvel.couponapp.data.CouponCategory

data class CouponInCouponCategory (
    @Embedded
    val couponCategory: CouponCategory,
    @Relation(
        parentColumn = "id",
        entityColumn = "category"
    )
    val coupons: List<Coupon>
)