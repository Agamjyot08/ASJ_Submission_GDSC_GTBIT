package com.example.fomo.repository

import com.example.fomo.Networking.retrofitService
import retrofit2.http.Query

class FoodRepository (private val retrofitService: retrofitService) {

    suspend fun getDishes(weather:String) = retrofitService.getDishes(weather)

    suspend fun getWeather(latitude:String, longitude:String) = retrofitService.getWeather(latitude, longitude)

    suspend fun getLocationDishes(latitude:String, longitude:String) = retrofitService.getLocationDishes(latitude, longitude)
}