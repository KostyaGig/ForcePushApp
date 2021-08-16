package com.zinoview.forcepush.domain.login;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/zinoview/forcepush/domain/login/LoginInteractor;", "", "authorized", "", "login", "Lcom/zinoview/forcepush/presentation/login/Auth;", "loginWrapper", "Lcom/zinoview/forcepush/presentation/login/LoginWrapper;", "(Lcom/zinoview/forcepush/presentation/login/LoginWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Base", "app_debug"})
public abstract interface LoginInteractor {
    
    public abstract boolean authorized();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    com.zinoview.forcepush.presentation.login.LoginWrapper loginWrapper, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.zinoview.forcepush.presentation.login.Auth> p1);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/zinoview/forcepush/domain/login/LoginInteractor$Base;", "Lcom/zinoview/forcepush/domain/login/LoginInteractor;", "loginRepository", "Lcom/zinoview/forcepush/data/LoginRepository;", "(Lcom/zinoview/forcepush/data/LoginRepository;)V", "authorized", "", "login", "Lcom/zinoview/forcepush/presentation/login/Auth;", "loginWrapper", "Lcom/zinoview/forcepush/presentation/login/LoginWrapper;", "(Lcom/zinoview/forcepush/presentation/login/LoginWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static final class Base implements com.zinoview.forcepush.domain.login.LoginInteractor {
        private final com.zinoview.forcepush.data.LoginRepository loginRepository = null;
        
        public Base(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.data.LoginRepository loginRepository) {
            super();
        }
        
        @java.lang.Override()
        public boolean authorized() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object login(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.login.LoginWrapper loginWrapper, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.zinoview.forcepush.presentation.login.Auth> p1) {
            return null;
        }
    }
}