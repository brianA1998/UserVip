package com.example.uservip

import android.app.Application

class UserVipApplication : Application() {

    companion object {
        lateinit var preferences: Prefences
    }

    override fun onCreate() {
        super.onCreate()
        preferences = Prefences(applicationContext)
    }

}