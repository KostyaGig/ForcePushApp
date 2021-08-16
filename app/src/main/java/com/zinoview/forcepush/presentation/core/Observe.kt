package com.zinoview.forcepush.presentation.core

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface Observe<T> {

    fun observe(lifecycleOwner: LifecycleOwner, observer: Observer<T>)
}