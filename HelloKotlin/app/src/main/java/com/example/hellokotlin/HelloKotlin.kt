package com.example.hellokotlin

fun main()
{
    var name= "Dipesh"
    val age:Int
    age = 19

    println("hello"+name+age)

    var city: String
    city = "jaipur"
    println("hello" +name +age +city)

    myfun(name,age)
    println(multiply(55,3))
}

fun multiply(x:Int ,y:Int):Int
{
    return(x*y)
}
fun add(x:Int,y:Int) = (x+y)   // we also define reurn type this by directly assign
fun myfun(s :String,a :Int){
    println("hello $s age is $a")
 }