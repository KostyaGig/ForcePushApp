package com.zinoview.forcepush.presentation.login

import androidx.lifecycle.viewModelScope
import com.zinoview.forcepush.core.TextMapper
import com.zinoview.forcepush.domain.login.LoginInteractor
import com.zinoview.forcepush.presentation.core.BaseViewModel
import kotlinx.coroutines.*


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
class LoginViewModel(
    communication: LoginCommunication,
    private val interactor: LoginInteractor,
    private val dispatchersIo: CoroutineDispatcher = Dispatchers.IO ,
    private val dispatchersMain: CoroutineDispatcher = Dispatchers.Main ,
) : BaseViewModel<LoginUi, LoginCommunication>(communication) {

    fun login(loginWrapper: LoginWrapper) {
        communication.map(LoginUi.Progress())
        viewModelScope.launch(dispatchersIo) {
            val result = interactor.login(loginWrapper)
            val resultUi = if (result is Auth.Fail) {
                result.map(LoginUiFailed())
            } else
                LoginUi.Success

            withContext(dispatchersMain) {
                communication.map(resultUi)
            }
        }
    }

    fun init() {
        val initialState = if (interactor.authorized()) LoginUi.Success else LoginUi.Initial()
        communication.map(initialState)
    }

    private inner class LoginUiFailed : TextMapper<LoginUi.Failed> {
        override fun map(src: String): LoginUi.Failed
            = LoginUi.Failed(src)
    }
}