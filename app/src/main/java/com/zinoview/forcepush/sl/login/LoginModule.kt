package com.zinoview.forcepush.sl.login

import com.zinoview.forcepush.data.LoginRepository
import com.zinoview.forcepush.domain.login.LoginInteractor
import com.zinoview.forcepush.presentation.login.LoginCommunication
import com.zinoview.forcepush.presentation.login.LoginViewModel
import com.zinoview.forcepush.sl.core.BaseModule
import com.zinoview.forcepush.sl.core.CoreModule


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
class LoginModule(
    private val coreModule: CoreModule
) : BaseModule<LoginViewModel> {

    override fun viewModel(): LoginViewModel
        = LoginViewModel(
            LoginCommunication.Base(),
            LoginInteractor.Base(
                LoginRepository.Base(coreModule.provideSharedPreferences())
            )
    )
}