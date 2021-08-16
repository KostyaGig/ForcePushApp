package com.zinoview.forcepush.presentation.core

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.zinoview.forcepush.core.Abstract


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
abstract class BaseViewModel<T : Abstract.UiObject, E : Communication<T>>
    (protected val communication: E) : ViewModel(), Observe<T> {

    override fun observe(lifecycleOwner: LifecycleOwner, observer: Observer<T>)
        = communication.observe(lifecycleOwner,observer)
}