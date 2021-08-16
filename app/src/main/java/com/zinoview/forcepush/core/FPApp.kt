package com.zinoview.forcepush.core

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.zinoview.forcepush.sl.core.CoreModule
import com.zinoview.forcepush.sl.core.DependencyContainer
import com.zinoview.forcepush.sl.core.ViewModelsFactory


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
class FPApp : Application() {

    private val factory by lazy {
        ViewModelsFactory(DependencyContainer.Base(coreModule))
    }

    private lateinit var coreModule: CoreModule

    override fun onCreate() {
        super.onCreate()

        coreModule =  CoreModule.Base(this)
    }

    fun <T : ViewModel> viewModel(modelClass: Class<T>, owner: ViewModelStoreOwner)
        = ViewModelProvider(owner, factory).get(modelClass)
}