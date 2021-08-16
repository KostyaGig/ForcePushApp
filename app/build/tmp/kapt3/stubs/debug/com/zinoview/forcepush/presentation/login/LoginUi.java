package com.zinoview.forcepush.presentation.login;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a8\u0006\r"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/LoginUi;", "Lcom/zinoview/forcepush/core/Abstract$UiObject;", "map", "", "error", "Lcom/zinoview/forcepush/presentation/core/AbstractView$Text;", "progress", "Lcom/zinoview/forcepush/presentation/core/AbstractView;", "button", "Failed", "Initial", "Progress", "Success", "app_debug"})
public abstract interface LoginUi extends com.zinoview.forcepush.core.Abstract.UiObject {
    
    public abstract void map(@org.jetbrains.annotations.NotNull()
    com.zinoview.forcepush.presentation.core.AbstractView.Text error, @org.jetbrains.annotations.NotNull()
    com.zinoview.forcepush.presentation.core.AbstractView progress, @org.jetbrains.annotations.NotNull()
    com.zinoview.forcepush.presentation.core.AbstractView button);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/LoginUi$Success;", "Lcom/zinoview/forcepush/presentation/login/LoginUi;", "()V", "app_debug"})
    public static final class Success implements com.zinoview.forcepush.presentation.login.LoginUi {
        @org.jetbrains.annotations.NotNull()
        public static final com.zinoview.forcepush.presentation.login.LoginUi.Success INSTANCE = null;
        
        public void map(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView.Text error, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView progress, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView button) {
        }
        
        private Success() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/LoginUi$Initial;", "Lcom/zinoview/forcepush/presentation/login/LoginUi;", "()V", "map", "", "error", "Lcom/zinoview/forcepush/presentation/core/AbstractView$Text;", "progress", "Lcom/zinoview/forcepush/presentation/core/AbstractView;", "button", "app_debug"})
    public static final class Initial implements com.zinoview.forcepush.presentation.login.LoginUi {
        
        public Initial() {
            super();
        }
        
        @java.lang.Override()
        public void map(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView.Text error, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView progress, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView button) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/LoginUi$Progress;", "Lcom/zinoview/forcepush/presentation/login/LoginUi;", "()V", "map", "", "error", "Lcom/zinoview/forcepush/presentation/core/AbstractView$Text;", "progress", "Lcom/zinoview/forcepush/presentation/core/AbstractView;", "button", "app_debug"})
    public static final class Progress implements com.zinoview.forcepush.presentation.login.LoginUi {
        
        public Progress() {
            super();
        }
        
        @java.lang.Override()
        public void map(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView.Text error, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView progress, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView button) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/LoginUi$Failed;", "Lcom/zinoview/forcepush/presentation/login/LoginUi;", "message", "", "(Ljava/lang/String;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "map", "", "error", "Lcom/zinoview/forcepush/presentation/core/AbstractView$Text;", "progress", "Lcom/zinoview/forcepush/presentation/core/AbstractView;", "button", "toString", "app_debug"})
    public static final class Failed implements com.zinoview.forcepush.presentation.login.LoginUi {
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.zinoview.forcepush.presentation.login.LoginUi.Failed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Failed(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        private final java.lang.String component1() {
            return null;
        }
        
        @java.lang.Override()
        public void map(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView.Text error, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView progress, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView button) {
        }
    }
    
    /**
     * @author Zinoview on 16.08.2021
     * k.gig@list.ru
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        public static void map(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.login.LoginUi $this, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView.Text error, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView progress, @org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.presentation.core.AbstractView button) {
        }
    }
}