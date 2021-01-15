package com.sunnyweather.android

import android.app.Application
import android.content.Context
import android.media.session.MediaSession

/**
 *@author created by GuanZhong
 *时间：2021/1/14 09
 *邮箱：906996141@qq.com
 */
class SunnyWeatherApplication: Application() {
    companion object{
        const val TOKEN="zbuvKgDl1B5qwGBF"
        lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}