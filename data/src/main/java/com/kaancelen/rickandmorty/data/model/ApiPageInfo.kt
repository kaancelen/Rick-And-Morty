package com.kaancelen.rickandmorty.data.model

data class ApiPageInfo(
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?,
)