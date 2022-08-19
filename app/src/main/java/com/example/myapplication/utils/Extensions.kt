package com.example.myapplication.utils

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.view.View
import androidx.core.content.ContextCompat.getSystemService

fun Context.isNetworkAvailable(): Boolean {
    val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
    val activeNetworkInfo = connectivityManager!!.activeNetworkInfo
    return activeNetworkInfo != null
}

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}