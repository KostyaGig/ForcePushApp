package com.zinoview.forcepush.sl.core

import androidx.lifecycle.ViewModel


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface BaseModule<T : ViewModel> {

    fun viewModel() : T
}