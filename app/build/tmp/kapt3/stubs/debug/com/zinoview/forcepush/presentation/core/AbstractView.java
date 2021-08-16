package com.zinoview.forcepush.presentation.core;

import java.lang.System;

/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/zinoview/forcepush/presentation/core/AbstractView;", "", "hide", "", "show", "Text", "app_debug"})
public abstract interface AbstractView {
    
    public abstract void show();
    
    public abstract void hide();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/zinoview/forcepush/presentation/core/AbstractView$Text;", "Lcom/zinoview/forcepush/presentation/core/AbstractView;", "show", "", "text", "", "app_debug"})
    public static abstract interface Text extends com.zinoview.forcepush.presentation.core.AbstractView {
        
        public abstract void show(@org.jetbrains.annotations.NotNull()
        java.lang.String text);
    }
}