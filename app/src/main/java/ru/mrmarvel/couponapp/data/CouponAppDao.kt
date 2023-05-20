package ru.mrmarvel.couponapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import ru.mrmarvel.couponapp.data.models.Coupon
import ru.mrmarvel.couponapp.data.models.CouponCategory

@Dao
interface CouponAppDao {
    @Insert
    suspend fun insertCoupon(coupon: Coupon)

    @Insert
    suspend fun updateCoupon(category: CouponCategory)

    @Query("SELECT * FROM coupon")
    suspend fun getAllCoupons(): LiveData<List<CouponCategory>>

    @Delete
    suspend fun deleteCoupon(category: CouponCategory)

    @Insert
    suspend fun insertCouponCategory(category: CouponCategory)

    @Insert
    suspend fun updateCouponCategory(category: CouponCategory)

    @Query("SELECT * FROM coupon")
    suspend fun getAllCouponCategories(): LiveData<List<CouponCategory>>

    @Delete
    suspend fun deleteCouponCategory(category: CouponCategory)

    @Transaction
    @Query("SELECT * FROM coupon WHERE category_id = :id")
    fun getCouponsInCategory(id: Int): List<CouponCategory>
}