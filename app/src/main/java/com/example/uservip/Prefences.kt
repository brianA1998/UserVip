package com.example.uservip

import android.content.Context

class Prefences(val context: Context) {
    val SHARED_NAME = "Mydtb"
    val storage = context.getSharedPreferences(SHARED_NAME,0)
}