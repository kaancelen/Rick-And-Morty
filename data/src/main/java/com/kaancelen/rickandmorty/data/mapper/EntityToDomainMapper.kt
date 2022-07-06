package com.kaancelen.rickandmorty.data.mapper

import com.kaancelen.rickandmorty.data.model.ApiCharacter
import com.kaancelen.rickandmorty.data.model.ApiResponse
import com.kaancelen.rickandmorty.domain.model.DomainCharacter

fun ApiResponse<ApiCharacter>.toDomain(): List<DomainCharacter> {
    return this.results.map { it.toDomain() }
}

fun ApiCharacter.toDomain(): DomainCharacter {
    return DomainCharacter(
        id = this.id,
        name = this.name
    )
}