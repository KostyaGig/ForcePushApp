package com.zinoview.forcepush.presentation.login

import com.zinoview.forcepush.presentation.core.Communication


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface LoginCommunication : Communication<LoginUi> {

    class Base : Communication.Base<LoginUi>(), LoginCommunication
}