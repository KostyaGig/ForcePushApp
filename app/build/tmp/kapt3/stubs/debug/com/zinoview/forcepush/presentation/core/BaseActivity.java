package com.zinoview.forcepush.presentation.core;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001a\u00020\tH\u0004\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/zinoview/forcepush/presentation/core/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "T", "Landroidx/lifecycle/ViewModel;", "model", "Ljava/lang/Class;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final <T extends androidx.lifecycle.ViewModel>T viewModel(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> model, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelStoreOwner owner) {
        return null;
    }
}