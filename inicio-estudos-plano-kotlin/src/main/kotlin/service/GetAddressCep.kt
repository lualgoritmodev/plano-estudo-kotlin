package org.example.service

import org.example.dto.AddressResponse

interface GetAddressCep {

    suspend fun getAddressWithCep(cep: String): AddressResponse
}