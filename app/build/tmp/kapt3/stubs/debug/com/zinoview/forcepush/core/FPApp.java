package com.zinoview.forcepush.core;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J+\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/zinoview/forcepush/core/FPApp;", "Landroid/app/Application;", "()V", "coreModule", "Lcom/zinoview/forcepush/sl/core/CoreModule;", "factory", "Lcom/zinoview/forcepush/sl/core/ViewModelsFactory;", "getFactory", "()Lcom/zinoview/forcepush/sl/core/ViewModelsFactory;", "factory$delegate", "Lkotlin/Lazy;", "onCreate", "", "viewModel", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class FPApp extends android.app.Application {
    private final kotlin.Lazy factory$delegate = null;
    private com.zinoview.forcepush.sl.core.CoreModule coreModule;
    
    public FPApp() {
        super();
    }
    
    private final com.zinoview.forcepush.sl.core.ViewModelsFactory getFactory() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends androidx.lifecycle.ViewModel>T viewModel(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelStoreOwner owner) {
        return null;
    }
}