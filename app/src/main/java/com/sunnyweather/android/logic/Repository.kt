package com.sunnyweather.android.logic

import androidx.lifecycle.liveData
import com.sunnyweather.android.logic.model.Place
import com.sunnyweather.android.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers

import okhttp3.Dispatcher
import java.lang.Exception
import java.lang.RuntimeException

/**
 *@author created by GuanZhong
 *时间：2021/1/14 15
 *邮箱：906996141@qq.com
 */
object Repository {
    fun searchPlaces(query:String)= liveData(Dispatchers.IO){
        val result=try {
            val placeResponse=SunnyWeatherNetwork.searchPlaces(query)
            println(placeResponse)
            if(placeResponse.status=="ok"){
                val places=placeResponse.places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        }catch (e:Exception){
            e.printStackTrace()
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}