package com.zinoview.forcepush.sl.core

import com.zinoview.forcepush.sl.login.LoginModule
import java.lang.IllegalArgumentException


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface DependencyContainer {

    fun module(feature: Feature) : BaseModule<*>

    class Base(private val coreModule: CoreModule) : DependencyContainer {

        override fun module(feature: Feature): BaseModule<*> = when(feature) {
            Feature.LOGIN -> LoginModule(coreModule)
            else -> throw IllegalArgumentException("Module for feature $feature not found")
        }

    }
}