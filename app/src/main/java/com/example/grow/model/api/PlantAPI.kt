package com.example.grow.model.api

import com.example.grow.model.PlantDetails
import retrofit2.Response
import retrofit2.http.GET


interface PlantAPI {

    @GET("/getPlantDatails")
    suspend fun getPlantDetails():Response<PlantDetails>
}