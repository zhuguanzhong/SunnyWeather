package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 *@author created by GuanZhong
 *时间：2021/1/14 09
 *邮箱：906996141@qq.com
 */
data class PlaceResponse(val status:String,val places:List<Place>)
data class Place(val name:String,val location:Location,@SerializedName("formatted_address") val address:String)
data class Location(val lng:String,val lat:String)