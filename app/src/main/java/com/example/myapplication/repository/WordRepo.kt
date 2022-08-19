package com.example.myapplication.repository

import android.content.Context
import com.example.myapplication.R
import java.util.*

class WordRepo(private val context: Context) {

    fun getWordlist(callback: (resource: ArrayList<String>) -> Unit) {
        val list: ArrayList<String> = ArrayList()
        list.add(context.getString(R.string.elephant))
        list.add(context.getString(R.string.cat))
        list.add(context.getString(R.string.dog))
        list.add(context.getString(R.string.aeroplane))
        list.add(context.getString(R.string.fan))
        list.add(context.getString(R.string.human))
        list.add(context.getString(R.string.fish))
        list.add(context.getString(R.string.ant))
        list.add(context.getString(R.string.snake))
        list.add(context.getString(R.string.lion))
        callback(list)

    }

}