package com.zinoview.forcepush.core;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/zinoview/forcepush/core/Abstract;", "", "()V", "Mapper", "Object", "UiObject", "app_debug"})
public abstract class Abstract {
    
    public Abstract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004J\u0015\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/zinoview/forcepush/core/Abstract$Object;", "T", "M", "Lcom/zinoview/forcepush/core/Abstract$Mapper;", "", "map", "mapper", "(Lcom/zinoview/forcepush/core/Abstract$Mapper;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface Object<T extends java.lang.Object, M extends com.zinoview.forcepush.core.Abstract.Mapper> {
        
        public abstract T map(@org.jetbrains.annotations.NotNull()
        M mapper);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/zinoview/forcepush/core/Abstract$UiObject;", "", "Empty", "app_debug"})
    public static abstract interface UiObject {
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/zinoview/forcepush/core/Abstract$UiObject$Empty;", "Lcom/zinoview/forcepush/core/Abstract$UiObject;", "()V", "app_debug"})
        public static final class Empty implements com.zinoview.forcepush.core.Abstract.UiObject {
            
            public Empty() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/zinoview/forcepush/core/Abstract$Mapper;", "", "Data", "Empty", "app_debug"})
    public static abstract interface Mapper {
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zinoview/forcepush/core/Abstract$Mapper$Data;", "S", "R", "Lcom/zinoview/forcepush/core/Abstract$Mapper;", "map", "src", "(Ljava/lang/Object;)Ljava/lang/Object;", "app_debug"})
        public static abstract interface Data<S extends java.lang.Object, R extends java.lang.Object> extends com.zinoview.forcepush.core.Abstract.Mapper {
            
            public abstract R map(S src);
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/zinoview/forcepush/core/Abstract$Mapper$Empty;", "Lcom/zinoview/forcepush/core/Abstract$Mapper;", "()V", "app_debug"})
        public static final class Empty implements com.zinoview.forcepush.core.Abstract.Mapper {
            
            public Empty() {
                super();
            }
        }
    }
}