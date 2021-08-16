package com.zinoview.forcepush.presentation.core;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R\u0016\u0010\u0007\u001a\u00028\u0001X\u0084\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/zinoview/forcepush/presentation/core/BaseViewModel;", "T", "Lcom/zinoview/forcepush/core/Abstract$UiObject;", "E", "Lcom/zinoview/forcepush/presentation/core/Communication;", "Landroidx/lifecycle/ViewModel;", "Lcom/zinoview/forcepush/presentation/core/Observe;", "communication", "(Lcom/zinoview/forcepush/presentation/core/Communication;)V", "getCommunication", "()Lcom/zinoview/forcepush/presentation/core/Communication;", "Lcom/zinoview/forcepush/presentation/core/Communication;", "observe", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "app_debug"})
public abstract class BaseViewModel<T extends com.zinoview.forcepush.core.Abstract.UiObject, E extends com.zinoview.forcepush.presentation.core.Communication<T>> extends androidx.lifecycle.ViewModel implements com.zinoview.forcepush.presentation.core.Observe<T> {
    @org.jetbrains.annotations.NotNull()
    private final E communication = null;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    E communication) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final E getCommunication() {
        return null;
    }
    
    @java.lang.Override()
    public void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<T> observer) {
    }
}