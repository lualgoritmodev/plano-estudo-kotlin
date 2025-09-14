package org.example.study

import org.example.entity.Person

fun main() {
    val person: List<Person> = listOf(
        Person(
            name = "Luciano",
            age = 41,
            genere = "Masculino",
            address = mutableSetOf()
        ),
        Person(
            name = "Luciana",
            age = 21,
            genere = "Feminino",
            address = mutableSetOf()
        ),
        Person(
            name = "Luciana",
            age = 12,
            genere = "Masculino",
            address = mutableSetOf()
        ),
        Person(
            name = "Lucas",
            age = 17,
            genere = "Masculino",
            address = mutableSetOf()
        ),
        Person(
            name = "Fernanda",
            age = 18,
            genere = "Feminino",
            address = mutableSetOf()
        )
    )
    //Verificando  com o filter quem é maior de idade
    val entre = person.filter {
        it.age >= 18
    }
    //Usando o foreach para imprimir o resultado do filter
    entre.forEach {
        println(" Podem entrar: ${it.name}, ${it.age}")
    }
    //usando o map para imprimir o resultado do filter
    val mind =  person.filter { it.age < 18 }
        .map { println("Não podem entrar ${it.name} é ${it.age} é ${it.genere}") }
    println(mind)

    //Usando partition
    val (canComeIn, cantEnter) = person.partition { it.age >= 18 }
    println("Podem entrar:")
    canComeIn.forEach {
        println("${it.name}, idade: ${it.age}, sexo: ${it.genere}")
    }
    println("---------------------------------------------------------------------------")
    println("Não podem entrar:")
    cantEnter.forEach {
        println("${it.name}, idade: ${it.age}, sexo: ${it.genere}")
    }

    val listPersonEnter = mutableListOf<Person>()
    val listPersonNotEnter = mutableListOf<Person>()

    for(i in person) {
        if(i.age >= 18) {
            listPersonEnter.add(i)
        }else {
            listPersonNotEnter.add(i)
        }
    }

    println("Podem entrar")
    listPersonEnter.forEach {
      println("${it.name}, idade: ${it.age}, sexo: ${it.genere}")
   }
    println("-------------------------")
    println("Não podem entrar")
    listPersonNotEnter.forEach {
        println("${it.name}, idade: ${it.age}, sexo: ${it.genere}")
    }

    println("----------------------------------------------")
    val (test, test2) = person.partition { it.age >= 18 }
    println("Podem entrar")
    test.forEach { println("${it.name}, idade: ${it.age}, sexo: ${it.genere}") }
    println("-------------------------")
    println("Não podem entrar")
    test2.forEach { println("${it.name}, idade:${it.age}, sexo: ${it.genere}") }
}