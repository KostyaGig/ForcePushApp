package com.zinoview.forcepush.sl.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zinoview.forcepush.presentation.login.LoginViewModel
import java.lang.IllegalArgumentException


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
class ViewModelsFactory(
    private val dependencyContainer: DependencyContainer
) : ViewModelProvider.Factory {

    private val map = HashMap<Class<*>, Feature>().apply {
        put(LoginViewModel::class.java, Feature.LOGIN)
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val feature = map[modelClass] ?: throw IllegalArgumentException("not found feature for model class $modelClass")
        return dependencyContainer.module(feature).viewModel() as T
    }
}