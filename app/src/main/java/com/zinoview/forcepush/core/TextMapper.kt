package com.zinoview.forcepush.core


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
interface TextMapper<T> : Abstract.Mapper.Data<String, T> {


    interface Void : TextMapper<Unit>
}