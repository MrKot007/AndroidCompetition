package com.example.androidcompetition

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface API {
    @GET("getCatalog")
    fun getCat(): Call<ModelBody>
}