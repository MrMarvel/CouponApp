package ru.mrmarvel.couponapp.data.models.relations

import androidx.room.Embedded
import androidx.room.Relation
import ru.mrmarvel.couponapp.data.models.Coupon
import ru.mrmarvel.couponapp.data.models.CouponCategory

data class CouponInCouponCategory (
    @Embedded
    val couponCategory: CouponCategory,
    @Relation(
        parentColumn = "id",
        entityColumn = "category_id"
    )
    val coupons: List<Coupon>
)