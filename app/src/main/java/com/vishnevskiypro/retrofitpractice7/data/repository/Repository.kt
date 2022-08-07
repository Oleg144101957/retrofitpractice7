package com.vishnevskiypro.retrofitpractice7.data.repository

import com.vishnevskiypro.retrofitpractice7.data.api.RetrofitInstance
import com.vishnevskiypro.retrofitpractice7.models.beznal.Beznalichka
import com.vishnevskiypro.retrofitpractice7.models.nal.Nalichka
import retrofit2.Response

class Repository {

    suspend fun getNalRepo(): Response<Nalichka>{
        return RetrofitInstance.api.getNalFromNetwork()
    }

    suspend fun getBeznal(): Response<Beznalichka>{
        return RetrofitInstance.api.getBeznalFromNetwork()
    }

}