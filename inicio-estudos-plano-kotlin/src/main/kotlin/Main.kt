    //package org.example
//
//import org.example.entity.Address
//import org.example.entity.Person
//import util.hello
//
//fun main() {
//   val people = mutableSetOf<Person>()
//    val hello = ""
//    hello.hello()
//    println("--------------------------")
//    while(true) {
//        println("Nome")
//        val name = readln()
//        println("Idade")
//        val age: Int? = readlnOrNull()?.toInt()
//        println("Gênero")
//        val genere = readln()
//        println("cep")
//        val address = mutableSetOf<Address>()
//
//        val person = Person(name, age, genere, address)
//        people.add(person)
//
//        println("Deseja cadastrar outra pessoa?(s/n")
//        val con = readLine() ?: "n"
//
//        if(con.lowercase()!= "s" ) break
//    }
//    println()
//    println("Pessoas Cadastradas")
//
//    people.forEach {
//        println(it.name)
//    }
//}
//
