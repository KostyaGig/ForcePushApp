package com.zinoview.forcepush.sl.core;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\r\u0010\u0004\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/zinoview/forcepush/sl/core/BaseModule;", "T", "Landroidx/lifecycle/ViewModel;", "", "viewModel", "()Landroidx/lifecycle/ViewModel;", "app_debug"})
public abstract interface BaseModule<T extends androidx.lifecycle.ViewModel> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract T viewModel();
}