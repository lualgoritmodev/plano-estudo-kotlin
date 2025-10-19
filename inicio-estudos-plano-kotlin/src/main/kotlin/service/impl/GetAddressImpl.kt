package org.example.service.impl

import io.ktor.client.HttpClient
import io.ktor.client.call.*
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import org.example.dto.AddressResponse
import org.example.service.GetAddressCep

class GetAddressImpl(
    private val client: HttpClient = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json { ignoreUnknownKeys = true })
        }
    }
): GetAddressCep {
    override suspend fun getAddressWithCep(cep: String): AddressResponse {
        val cep = cep.filter { it.isDigit() }
        val url = "https://viacep.com.br/ws/$cep/json/"
        return client.get(url).body()
    }

}
