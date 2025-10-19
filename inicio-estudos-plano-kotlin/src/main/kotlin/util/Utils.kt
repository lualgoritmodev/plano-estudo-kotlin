package org.example.entity

import org.example.entity.Person

fun String.hello() {
        println("Seja bem vindo!")
        println("Vamos cadastrar um cliente:")
    }

fun getPersonByName(people: List<Person>, name: String): Person? {
    if(people.isEmpty()) {
        println("Lista está vazia!")
    }
    return  people.find { it.name == name }
}

fun getPersonId(idPerson: Int, person: List<Person>): Person? {
    val client = person.find { it.idPerson == idPerson }
    if(client?.idPerson == null) println("Person não existe")
    return client
}

fun deletePersonById(idPerson: Int, person: MutableList<Person>) {
        val peopleRemoved = person.removeIf { it.idPerson == idPerson }
        if(peopleRemoved) {
            println("Usuário removido com sucesso")
        }else {
            println("Usuário não existe")
        }
}

fun updatePerson(idPerson: Int, updatePerson: Person, people: List<Person>): List<Person> {
    return people.map { person ->
        if(person.idPerson == idPerson) updatePerson else person
    }
}