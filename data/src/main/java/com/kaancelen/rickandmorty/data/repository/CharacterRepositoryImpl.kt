package com.kaancelen.rickandmorty.data.repository

import com.kaancelen.rickandmorty.data.extension.domainResponse
import com.kaancelen.rickandmorty.data.mapper.toDomain
import com.kaancelen.rickandmorty.data.source.CharacterDataSource
import com.kaancelen.rickandmorty.domain.base.DomainResponse
import com.kaancelen.rickandmorty.domain.character.CharacterRepository
import com.kaancelen.rickandmorty.domain.model.DomainCharacter
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val characterDataSource: CharacterDataSource
): CharacterRepository {

    override suspend fun getAllCharacters(page: Int): DomainResponse<List<DomainCharacter>> = domainResponse {
        characterDataSource.getAllCharacters(page).toDomain()
    }

    override suspend fun getCharacter(id: Int): DomainResponse<DomainCharacter> = domainResponse {
        characterDataSource.getCharacter(id).toDomain()
    }

}