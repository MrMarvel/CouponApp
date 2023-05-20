package ru.mrmarvel.couponapp.data

import androidx.room.Database
import androidx.room.ProvidedTypeConverter
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import ru.mrmarvel.couponapp.data.models.Coupon
import ru.mrmarvel.couponapp.data.models.CouponCategory
import ru.mrmarvel.couponapp.data.models.User
import ru.mrmarvel.couponapp.data.models.relations.CouponInCouponCategory
import java.util.Date

// @TypeConverters(Converters::class)
// @Database(
//     entities = [
//         Coupon::class
//     ],
//     version = 1
// )
// abstract class CouponAppDatabase: RoomDatabase() {
//     abstract fun couponAppDao(): CouponAppDao
//
//     abstract class SchoolDataBase: RoomDatabase() {
//         abstract fun resultsDao(): CouponAppDao
//     }
// }
// class Converters {
//     @TypeConverter
//     fun fromTimestamp(value: Long?): Date? {
//         return value?.let { Date(it) }
//     }
//
//     @TypeConverter
//     fun dateToTimestamp(date: Date?): Long? {
//         return date?.time
//     }
//
//
// }