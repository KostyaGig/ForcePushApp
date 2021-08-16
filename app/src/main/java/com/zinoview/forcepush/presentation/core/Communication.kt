package com.zinoview.forcepush.presentation.core

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.zinoview.forcepush.core.Abstract


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface Communication<T : Abstract.UiObject> : Observe<T>, Abstract.Mapper.Data<T,Unit> {

    abstract class Base<T : Abstract.UiObject> : Communication<T> {

        private val liveData = MutableLiveData<T>()

        override fun map(src: T) {
            liveData.value = src
        }

        override fun observe(lifecycleOwner: LifecycleOwner, observer: Observer<T>)
            = liveData.observe(lifecycleOwner,observer)
    }
}