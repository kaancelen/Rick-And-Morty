package com.kaancelen.rickandmorty.data.extension

import com.kaancelen.rickandmorty.domain.base.DomainResponse
import retrofit2.HttpException
import java.lang.Exception

suspend fun <T: Any> domainResponse(
    result: suspend () -> T
) = try {
    DomainResponse.Content(result())
} catch (e: Exception) {
    parseRequestError(e)
}

private fun parseRequestError(e: Exception): DomainResponse.Error {
    return when {
        (e is HttpException) -> {
            DomainResponse.Error(
                code = e.code(),
                message = e.message()
            )
        }
        else -> {
            DomainResponse.Error(
                code = 500,
                message = "${e.javaClass.simpleName} ${e.localizedMessage}"
            )
        }
    }
}