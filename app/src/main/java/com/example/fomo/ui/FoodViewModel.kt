package com.example.fomo.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fomo.Networking.FoodItem
import com.example.fomo.Networking.Weather
import com.example.fomo.repository.FoodRepository
import kotlinx.coroutines.launch
import retrofit2.Call

class FoodViewModel constructor(private val repository: FoodRepository)  : ViewModel() {

    private val _weatherres: MutableLiveData<Call<Weather>> = MutableLiveData()
    val weatherres: LiveData<Call<Weather>>
        get() = _weatherres

    fun getWeather(latitude:String, longitude:String) = viewModelScope.launch {
        Log.d("LogFoodViewModel", latitude.toString())
        _weatherres.value = repository.getWeather(latitude, longitude)
    }

    private val _dishesres: MutableLiveData<Call<List<FoodItem>>> = MutableLiveData()
    val dishesres: LiveData<Call<List<FoodItem>>>
        get() = _dishesres

    fun getDishes(weatherres: String) = viewModelScope.launch {
        Log.d("LogFoodViewModel2", weatherres.toString())
        _dishesres.value = repository.getDishes(weatherres)
    }

    private val _locationres: MutableLiveData<Call<List<FoodItem>>> = MutableLiveData()
    val locationres: LiveData<Call<List<FoodItem>>>
        get() = _dishesres

    fun getLocationDishes(latitude:String, longitude:String) = viewModelScope.launch {
        Log.d("LogFoodViewModel2", latitude.toString())
        _locationres.value = repository.getLocationDishes(latitude, longitude)
    }
}