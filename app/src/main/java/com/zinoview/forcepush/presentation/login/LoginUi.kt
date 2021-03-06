package com.zinoview.forcepush.presentation.login

import com.zinoview.forcepush.core.Abstract
import com.zinoview.forcepush.presentation.core.AbstractView


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface LoginUi : Abstract.UiObject {

    fun map(error: AbstractView.Text, progress: AbstractView, button: AbstractView) = Unit

    object Success : LoginUi

    class Initial : LoginUi {

        override fun map(error: AbstractView.Text, progress: AbstractView, button: AbstractView) {
            error.hide()
            progress.hide()
            button.show()
        }
    }

    class Progress : LoginUi {

        override fun map(error: AbstractView.Text, progress: AbstractView, button: AbstractView) {
            error.hide()
            progress.show()
            button.hide()
        }
    }

    data class Failed(
        private val message: String
    ) : LoginUi {

        override fun map(error: AbstractView.Text, progress: AbstractView, button: AbstractView) {
            error.show(message)
            progress.hide()
            button.show()
        }
    }
}