package ru.mrmarvel.couponapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "coupon")
data class Coupon (
    @PrimaryKey
    val id: ULong,
    val category_id: ULong,
    val content: String,
    val expiring_date: Date? = null,
    val added_by_user_id: ULong,
    val owned_by_user_id: ULong,
)
