package com.zinoview.forcepush.core


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
abstract class Abstract {

    interface Object<T, M: Mapper> {

        fun map(mapper: M) : T
    }

    interface UiObject {

        class Empty : UiObject
    }

    interface Mapper {

        interface Data<S,R> : Mapper {
            fun map(src: S) : R
        }

        class Empty : Mapper
    }

}