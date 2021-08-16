package com.zinoview.forcepush.core


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface Read<out T> {

    fun read() : T
}