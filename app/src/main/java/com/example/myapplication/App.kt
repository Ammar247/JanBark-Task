package com.example.myapplication

import android.app.Application
import com.example.myapplication.ads.MobileAdsUtil

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        MobileAdsUtil(this)
    }
}