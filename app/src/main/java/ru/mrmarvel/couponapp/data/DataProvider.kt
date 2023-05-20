package ru.mrmarvel.couponapp.data

import java.util.Calendar
import java.util.Date

object DataProvider {
    val couponCategory = CouponCategory(1, "KFC", "-20%", best_expire_date = Date())
    val couponCategoryList: List<CouponCategory>
    init {
        val list = ArrayList<CouponCategory>()
        val date = Calendar.getInstance()
        for (i in 0..4) {
            date.add(Calendar.DATE, 1)
            list.add(CouponCategory(
                id=i+1,
                shortName="-${15+i}%",
                shopName = "KFC",
                best_expire_date = date.time))
        }
        couponCategoryList = list
    }

}