package ru.mrmarvel.couponapp;

import android.app.Activity
import android.content.res.Resources
import android.os.Bundle
import android.os.PersistableBundle

class MainResources: Activity() {

    companion object {
        public var pv_resources: Resources? = null
        fun getAppResources(): Resources? {
            return pv_resources
        }
    }

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pv_resources = resources
    }
}
