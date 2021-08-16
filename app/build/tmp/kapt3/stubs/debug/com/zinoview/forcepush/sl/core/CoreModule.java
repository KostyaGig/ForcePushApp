package com.zinoview.forcepush.sl.core;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/zinoview/forcepush/sl/core/CoreModule;", "", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "Base", "app_debug"})
public abstract interface CoreModule {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.SharedPreferences provideSharedPreferences();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/zinoview/forcepush/sl/core/CoreModule$Base;", "Lcom/zinoview/forcepush/sl/core/CoreModule;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "app_debug"})
    public static final class Base implements com.zinoview.forcepush.sl.core.CoreModule {
        private final android.content.Context context = null;
        
        public Base(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.content.SharedPreferences provideSharedPreferences() {
            return null;
        }
    }
}