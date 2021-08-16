package com.zinoview.forcepush.presentation.core

import com.zinoview.forcepush.core.TextMapper


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface AbstractView {

    fun show()

    fun hide()

    interface Text : AbstractView {

        fun show(text: String)
    }
}