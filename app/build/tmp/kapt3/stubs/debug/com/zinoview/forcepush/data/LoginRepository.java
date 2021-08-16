package com.zinoview.forcepush.data;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/zinoview/forcepush/data/LoginRepository;", "Lcom/zinoview/forcepush/core/Save;", "", "user", "", "Base", "app_debug"})
public abstract interface LoginRepository extends com.zinoview.forcepush.core.Save<java.lang.String> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object user();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/zinoview/forcepush/data/LoginRepository$Base;", "Lcom/zinoview/forcepush/data/LoginRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "save", "", "data", "", "user", "", "app_debug"})
    public static final class Base implements com.zinoview.forcepush.data.LoginRepository {
        private final android.content.SharedPreferences sharedPreferences = null;
        
        public Base(@org.jetbrains.annotations.NotNull()
        android.content.SharedPreferences sharedPreferences) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object user() {
            return null;
        }
        
        @java.lang.Override()
        public void save(@org.jetbrains.annotations.NotNull()
        java.lang.String data) {
        }
    }
}