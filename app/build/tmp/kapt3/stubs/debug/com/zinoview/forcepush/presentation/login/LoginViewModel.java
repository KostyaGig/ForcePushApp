package com.zinoview.forcepush.presentation.login;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/LoginViewModel;", "Lcom/zinoview/forcepush/presentation/core/BaseViewModel;", "Lcom/zinoview/forcepush/presentation/login/LoginUi;", "Lcom/zinoview/forcepush/presentation/login/LoginCommunication;", "communication", "interactor", "Lcom/zinoview/forcepush/domain/login/LoginInteractor;", "dispatchersIo", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatchersMain", "(Lcom/zinoview/forcepush/presentation/login/LoginCommunication;Lcom/zinoview/forcepush/domain/login/LoginInteractor;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "init", "", "login", "loginWrapper", "Lcom/zinoview/forcepush/presentation/login/LoginWrapper;", "LoginUiFailed", "app_debug"})
public final class LoginViewModel extends com.zinoview.forcepush.presentation.core.BaseViewModel<com.zinoview.forcepush.presentation.login.LoginUi, com.zinoview.forcepush.presentation.login.LoginCommunication> {
    private final com.zinoview.forcepush.domain.login.LoginInteractor interactor = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatchersIo = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatchersMain = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.zinoview.forcepush.presentation.login.LoginCommunication communication, @org.jetbrains.annotations.NotNull()
    com.zinoview.forcepush.domain.login.LoginInteractor interactor, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatchersIo, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatchersMain) {
        super(null);
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    com.zinoview.forcepush.presentation.login.LoginWrapper loginWrapper) {
    }
    
    public final void init() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/LoginViewModel$LoginUiFailed;", "Lcom/zinoview/forcepush/core/TextMapper;", "Lcom/zinoview/forcepush/presentation/login/LoginUi$Failed;", "(Lcom/zinoview/forcepush/presentation/login/LoginViewModel;)V", "map", "src", "", "app_debug"})
    final class LoginUiFailed implements com.zinoview.forcepush.core.TextMapper<com.zinoview.forcepush.presentation.login.LoginUi.Failed> {
        
        public LoginUiFailed() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.zinoview.forcepush.presentation.login.LoginUi.Failed map(@org.jetbrains.annotations.NotNull()
        java.lang.String src) {
            return null;
        }
    }
}