package org.example.entity

import org.example.dto.AddressResponse

data class Person(
    val idPerson: Int,
    val name: String,
    val age: Int?,
    val genere: String,
    val cep: String,
    val address: MutableSet<AddressResponse> = mutableSetOf()
)
