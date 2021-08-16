package com.zinoview.forcepush.presentation.core

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStoreOwner
import com.zinoview.forcepush.core.FPApp


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */

abstract class BaseActivity : AppCompatActivity() {

    protected fun <T : ViewModel> viewModel(model: Class<T>, owner: ViewModelStoreOwner)
        = (application as FPApp).viewModel(model,owner)
}