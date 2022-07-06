package com.kaancelen.rickandmorty.data.model

data class ApiCharacter(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: ApiInfo,
    val location: ApiInfo,
    val image: String,
    val episodes: List<String>,
    val url: String,
    val created: String
)