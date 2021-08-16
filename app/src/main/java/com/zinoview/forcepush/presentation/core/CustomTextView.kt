package com.zinoview.forcepush.presentation.core

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatTextView


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
class CustomTextView : androidx.appcompat.widget.AppCompatTextView, AbstractView.Text {
    //region constructors
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
    //endregion

    override fun show(text: String) {
        show()
        setText(text)
    }

    override fun show() {
        visibility = View.VISIBLE
    }

    override fun hide() {
        visibility = View.GONE
    }
}