package com.zinoview.forcepush.data

import android.content.SharedPreferences
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.zinoview.forcepush.core.Save


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface LoginRepository : Save<String> {

    fun user() : Any?

    class Base(
        private val sharedPreferences: SharedPreferences
    ) : LoginRepository {

        override fun user(): Any?
            = Firebase.auth.currentUser

        override fun save(data: String) = sharedPreferences.edit().putString("profile",data).apply()
    }

}