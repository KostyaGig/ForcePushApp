package com.zinoview.forcepush.presentation.core;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zinoview/forcepush/presentation/core/Communication;", "T", "Lcom/zinoview/forcepush/core/Abstract$UiObject;", "Lcom/zinoview/forcepush/presentation/core/Observe;", "Lcom/zinoview/forcepush/core/Abstract$Mapper$Data;", "", "Base", "app_debug"})
public abstract interface Communication<T extends com.zinoview.forcepush.core.Abstract.UiObject> extends com.zinoview.forcepush.presentation.core.Observe<T>, com.zinoview.forcepush.core.Abstract.Mapper.Data<T, kotlin.Unit> {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/zinoview/forcepush/presentation/core/Communication$Base;", "T", "Lcom/zinoview/forcepush/core/Abstract$UiObject;", "Lcom/zinoview/forcepush/presentation/core/Communication;", "()V", "liveData", "Landroidx/lifecycle/MutableLiveData;", "map", "", "src", "(Lcom/zinoview/forcepush/core/Abstract$UiObject;)V", "observe", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "app_debug"})
    public static abstract class Base<T extends com.zinoview.forcepush.core.Abstract.UiObject> implements com.zinoview.forcepush.presentation.core.Communication<T> {
        private final androidx.lifecycle.MutableLiveData<T> liveData = null;
        
        public Base() {
            super();
        }
        
        @java.lang.Override()
        public void map(@org.jetbrains.annotations.NotNull()
        T src) {
        }
        
        @java.lang.Override()
        public void observe(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.Observer<T> observer) {
        }
    }
}