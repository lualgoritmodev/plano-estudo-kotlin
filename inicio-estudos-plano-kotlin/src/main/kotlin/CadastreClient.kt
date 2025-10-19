package org.example

import kotlinx.coroutines.runBlocking
import org.example.entity.Person
import org.example.entity.getPersonId
import org.example.service.impl.GetAddressImpl
import org.example.entity.hello

fun main() = runBlocking {

    val string = ""
    val person = mutableSetOf<Person>()
    string.hello()
    val getAddress = GetAddressImpl()

    while(true) {
        println("ID")
        val id = readln().toInt()
        println("Nome")
        val name = readln()
        println("Idade")
        val age: Int? = readlnOrNull()?.toInt()
        println("Gênero")
        val genere = readln()
        println("cep")
        val cep = readln()
        val address = getAddress.getAddressWithCep(cep)
        val client = Person(id, name, age, genere, cep, mutableSetOf(address))

        person.add(client)
        println("Cadastrar outro cliente? s/n")
        val con = readln()

        if(con.lowercase() != "s")break
    }

    person.forEach {
        println("Nome: ${it.name}, Endereço: ${it.address}")
    }

    println("----------------------------------------")
    println("Buscando por ID")
    do {
        println("Buscar por ID")
        val id = readln().toInt()
        if(id == null) {
            println("Id inválido")
        }else {
            val foundPerson = getPersonId(id, person.toMutableList())
            if (foundPerson != null) {
                println("${foundPerson.idPerson}, ${foundPerson.name}")
            }else {
                println("Este ID é inválido!")
            }

        }

        println("Buscar outro ID? s/n")
        val con = readln()
        if(con.lowercase() != "s")break

    }while(true)

}
