package com.zinoview.forcepush.presentation.login;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/LoginWrapper;", "", "login", "Lcom/zinoview/forcepush/presentation/login/Auth;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Base", "app_debug"})
public abstract interface LoginWrapper {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.zinoview.forcepush.presentation.login.Auth> p0);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\n\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/LoginWrapper$Base;", "Lcom/zinoview/forcepush/presentation/login/LoginWrapper;", "activity", "Lcom/zinoview/forcepush/presentation/login/LoginActivity;", "(Lcom/zinoview/forcepush/presentation/login/LoginActivity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "provider", "Lcom/google/firebase/auth/OAuthProvider$Builder;", "authInternal", "Lcom/google/firebase/auth/AuthResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/zinoview/forcepush/presentation/login/LoginActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authResult", "pending", "Lcom/google/android/gms/tasks/Task;", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/zinoview/forcepush/presentation/login/Auth;", "app_debug"})
    public static final class Base implements com.zinoview.forcepush.presentation.login.LoginWrapper {
        private final java.lang.ref.WeakReference<com.zinoview.forcepush.presentation.login.LoginActivity> activityWeakReference = null;
        private final com.google.firebase.auth.OAuthProvider.Builder provider = null;
        
        public Base(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.login.LoginActivity activity) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object login(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.zinoview.forcepush.presentation.login.Auth> p0) {
            return null;
        }
        
        private final java.lang.Object authInternal(com.zinoview.forcepush.presentation.login.LoginActivity activity, kotlin.coroutines.Continuation<? super com.google.firebase.auth.AuthResult> p1) {
            return null;
        }
        
        private final java.lang.Object authInternal(kotlin.coroutines.Continuation<? super com.google.firebase.auth.AuthResult> p0) {
            return null;
        }
        
        private final java.lang.Object authResult(com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> pending, kotlin.coroutines.Continuation<? super com.google.firebase.auth.AuthResult> p1) {
            return null;
        }
    }
}