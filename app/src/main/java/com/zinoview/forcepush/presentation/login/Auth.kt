package com.zinoview.forcepush.presentation.login

import com.zinoview.forcepush.core.TextMapper


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface Auth {

    fun <T> map(mapper: TextMapper<T>) : T

    data class Base(
        private val profile: Map<String, Any>
    ) : Auth {

        override fun <T> map(mapper: TextMapper<T>): T
            = mapper.map(profile["bio"].toString())
    }

    data class Fail(
        private val e: Exception
    ) : Auth {

        override fun <T> map(mapper: TextMapper<T>): T
            = mapper.map(e.message.toString())
    }
}