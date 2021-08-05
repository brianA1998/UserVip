package com.example.uservip

import android.content.Context

class Prefences(val context: Context) {

    //Constantes
    val SHARED_NAME = "Mydtb"
    val SHARED_USER_NAME = "username"
    val SHARED_VIP = "vip"


    val storage = context.getSharedPreferences(SHARED_NAME, 0)


    /**
     * Permite guardar nombre de usuario
     */
    fun saveName(name: String) {
        storage.edit().putString(SHARED_USER_NAME, name).apply()
    }

    /**
     * Permite guardar la seleccion del check
     */
    fun saveVIP(vip: Boolean) {
        storage.edit().putBoolean(SHARED_VIP,vip).apply()
    }

    /**
     * Permite leer los valores del archivo
     */
    fun getName(){
        storage.getString(SHARED_USER_NAME,"")
    }

}