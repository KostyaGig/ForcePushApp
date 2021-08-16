package com.zinoview.forcepush.core


/**
 * @author Zinoview on 16.08.2021
 * k.gig@list.ru
 */
class SaveText(
    private val dataSource: Save<String>
) : TextMapper.Void {

    override fun map(src: String) = dataSource.save(src)
}