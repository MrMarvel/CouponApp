package ru.mrmarvel.couponapp.data.repositories

import dagger.hilt.android.scopes.ViewModelScoped
import ru.mrmarvel.couponapp.data.CouponAppDao
import javax.inject.Inject


class CouponAppRepository constructor(private val couponAppDao: CouponAppDao) {

}