package com.zinoview.forcepush.sl.core;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/zinoview/forcepush/sl/core/DependencyContainer;", "", "module", "Lcom/zinoview/forcepush/sl/core/BaseModule;", "feature", "Lcom/zinoview/forcepush/sl/core/Feature;", "Base", "app_debug"})
public abstract interface DependencyContainer {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.zinoview.forcepush.sl.core.BaseModule<?> module(@org.jetbrains.annotations.NotNull()
    com.zinoview.forcepush.sl.core.Feature feature);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/zinoview/forcepush/sl/core/DependencyContainer$Base;", "Lcom/zinoview/forcepush/sl/core/DependencyContainer;", "coreModule", "Lcom/zinoview/forcepush/sl/core/CoreModule;", "(Lcom/zinoview/forcepush/sl/core/CoreModule;)V", "module", "Lcom/zinoview/forcepush/sl/core/BaseModule;", "feature", "Lcom/zinoview/forcepush/sl/core/Feature;", "app_debug"})
    public static final class Base implements com.zinoview.forcepush.sl.core.DependencyContainer {
        private final com.zinoview.forcepush.sl.core.CoreModule coreModule = null;
        
        public Base(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.sl.core.CoreModule coreModule) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.zinoview.forcepush.sl.core.BaseModule<?> module(@org.jetbrains.annotations.NotNull()
        com.zinoview.forcepush.sl.core.Feature feature) {
            return null;
        }
    }
}