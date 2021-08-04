package com.example.uservip

import android.content.Context

class Prefences(val context: Context) {

    //Constantes
    val SHARED_NAME = "Mydtb"
    val SHARED_USER_NAME = "username"


    val storage = context.getSharedPreferences(SHARED_NAME, 0)


    /**
     * Permite guardar nombre de usuario
     */
    fun saveName(name: String) {
        storage.edit().putString(SHARED_USER_NAME, name).apply()
    }

}