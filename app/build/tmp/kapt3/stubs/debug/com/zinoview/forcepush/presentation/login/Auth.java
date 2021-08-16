package com.zinoview.forcepush.presentation.login;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0007\bJ!\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/Auth;", "", "map", "T", "mapper", "Lcom/zinoview/forcepush/core/TextMapper;", "(Lcom/zinoview/forcepush/core/TextMapper;)Ljava/lang/Object;", "Base", "Fail", "app_debug"})
public abstract interface Auth {
    
    public abstract <T extends java.lang.Object>T map(@org.jetbrains.annotations.NotNull()
    com.zinoview.forcepush.core.TextMapper<T> mapper);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c2\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J!\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0004H\u00d6\u0001R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/Auth$Base;", "Lcom/zinoview/forcepush/presentation/login/Auth;", "profile", "", "", "", "(Ljava/util/Map;)V", "component1", "copy", "equals", "", "other", "hashCode", "", "map", "T", "mapper", "Lcom/zinoview/forcepush/core/TextMapper;", "(Lcom/zinoview/forcepush/core/TextMapper;)Ljava/lang/Object;", "toString", "app_debug"})
    public static final class Base implements com.zinoview.forcepush.presentation.login.Auth {
        private final java.util.Map<java.lang.String, java.lang.Object> profile = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.zinoview.forcepush.presentation.login.Auth.Base copy(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.lang.Object> profile) {
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
        
        public Base(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.lang.Object> profile) {
            super();
        }
        
        private final java.util.Map<java.lang.String, java.lang.Object> component1() {
            return null;
        }
        
        @java.lang.Override()
        public <T extends java.lang.Object>T map(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.core.TextMapper<T> mapper) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004H\u00c2\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J!\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/zinoview/forcepush/presentation/login/Auth$Fail;", "Lcom/zinoview/forcepush/presentation/login/Auth;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "map", "T", "mapper", "Lcom/zinoview/forcepush/core/TextMapper;", "(Lcom/zinoview/forcepush/core/TextMapper;)Ljava/lang/Object;", "toString", "", "app_debug"})
    public static final class Fail implements com.zinoview.forcepush.presentation.login.Auth {
        private final java.lang.Exception e = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.zinoview.forcepush.presentation.login.Auth.Fail copy(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e) {
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
        
        public Fail(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e) {
            super();
        }
        
        private final java.lang.Exception component1() {
            return null;
        }
        
        @java.lang.Override()
        public <T extends java.lang.Object>T map(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.core.TextMapper<T> mapper) {
            return null;
        }
    }
}