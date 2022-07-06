package com.kaancelen.rickandmorty.data.source

import com.kaancelen.rickandmorty.data.network.CharactersApiService
import javax.inject.Inject

class CharacterDataSource @Inject constructor(
    private val apiCharacters: CharactersApiService
) {
    suspend fun getAllCharacters(page: Int) = apiCharacters.getAllCharacters(page)

    suspend fun getCharacter(id: Int) = apiCharacters.getCharacter(id)
}