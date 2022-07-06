package com.kaancelen.rickandmorty.data.network

import com.kaancelen.rickandmorty.data.model.ApiCharacter
import com.kaancelen.rickandmorty.data.model.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharactersApiService {

    @GET("character")
    suspend fun getAllCharacters(@Query("page") page: Int): ApiResponse<ApiCharacter>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): ApiCharacter
}