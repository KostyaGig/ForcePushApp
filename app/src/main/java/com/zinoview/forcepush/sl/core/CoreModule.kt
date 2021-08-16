package com.zinoview.forcepush.sl.core

import android.content.Context
import android.content.SharedPreferences


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface CoreModule {

    fun provideSharedPreferences(): SharedPreferences

    class Base(private val context: Context) : CoreModule {

        override fun provideSharedPreferences(): SharedPreferences =
            context.getSharedPreferences("ForceAppSharedPref", Context.MODE_PRIVATE)
    }
}