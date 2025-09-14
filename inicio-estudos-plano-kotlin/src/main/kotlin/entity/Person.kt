package org.example.entity

data class Person(
    val name: String,
    val age: Int,
    val genere: Char,
    val address: MutableSet<Address> = mutableSetOf<Address>()
)
