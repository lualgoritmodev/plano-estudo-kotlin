package org.example.entity

data class Person(
    val name: String,
    val age: Int,
    val genere: String,
    val address: MutableSet<Address> = mutableSetOf()
)
