package com.zinoview.forcepush.domain.login

import com.zinoview.forcepush.core.SaveText
import com.zinoview.forcepush.data.LoginRepository
import com.zinoview.forcepush.presentation.login.Auth
import com.zinoview.forcepush.presentation.login.LoginWrapper


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface LoginInteractor {

    fun authorized() : Boolean

    suspend fun login(loginWrapper: LoginWrapper) : Auth

    class Base(
        private val loginRepository: LoginRepository
    ) : LoginInteractor {

        override fun authorized(): Boolean = loginRepository.user() != null

        override suspend fun login(loginWrapper: LoginWrapper): Auth {
            val result = loginWrapper.login()
            if (result is Auth.Base) {
                result.map(SaveText(loginRepository))
            }
            return result
        }

    }
}