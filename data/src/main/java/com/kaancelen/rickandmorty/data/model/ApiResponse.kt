package com.kaancelen.rickandmorty.data.model

data class ApiResponse<T>(
    val info: ApiPageInfo,
    val results: List<T>
)