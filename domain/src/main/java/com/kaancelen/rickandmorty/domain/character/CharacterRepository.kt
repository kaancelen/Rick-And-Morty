package com.kaancelen.rickandmorty.domain.character

import com.kaancelen.rickandmorty.domain.base.DomainResponse
import com.kaancelen.rickandmorty.domain.model.DomainCharacter

interface CharacterRepository {

    suspend fun getAllCharacters(page: Int): DomainResponse<List<DomainCharacter>>

    suspend fun getCharacter(id: Int): DomainResponse<DomainCharacter>

}