//package org.example.study
//
//import org.example.entity.Person
//
//fun main() {
//    val person: List<Person> = listOf(
//        Person(
//            name = "Luciano",
//            age = 41,
//            genere = "Masculino",
//            address = mutableSetOf()
//        ),
//        Person(
//            name = "Luciana",
//            age = 21,
//            genere = "Feminino",
//            address = mutableSetOf()
//        ),
//        Person(
//            name = "Luciana",
//            age = 12,
//            genere = "Masculino",
//            address = mutableSetOf()
//        ),
//        Person(
//            name = "Lucas",
//            age = 17,
//            genere = "Masculino",
//            address = mutableSetOf()
//        ),
//        Person(
//            name = "Fernanda",
//            age = 18,
//            genere = "Feminino",
//            address = mutableSetOf()
//        )
//    )
//
//    //fun Person.getAge() = this.age >= 18
//
//    val luciano =  Person(
//        name = "Luciano",
//        age = 41,
//        genere = "Masculino",
//        address = mutableSetOf()
//    )
//    val fernanda = Person(
//        name = "Fernanda",
//        age = 15,
//        genere = "Feminino",
//        address = mutableSetOf()
//    )
//
//    fun List<Person>.listPerson():List<Person> {
//        this.forEach {
//            println(it.name)
//        }
//        return this
//    }
//    fun List<Person>.getStringName() = person.map { it.name }
//        .forEach { println("Nome:$it") }
//
//    person.getStringName()
////    println("Nome: ${luciano.getAge()}}")
////    println("--------------------------")
////    println("Nome: ${fernanda.getAge()}")
////    val (pair, impar) = person.partition { it.age %2 == 0 }
////    listOf(
////        "Números pares " to pair,
////        "Número impares " to impar
////    ).forEach {
////        println(" ${it.second}")
////        println(" ${it.first}")
////    }
//}