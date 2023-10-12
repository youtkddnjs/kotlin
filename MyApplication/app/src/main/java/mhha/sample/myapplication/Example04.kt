package mhha.sample.myapplication

fun main(){
    //반복문
    println("기본")
    for( i in 1..10){
        // in 1..10 == IntRange(1, 10)
        // in 1 until 11
        print(i)
        print(",")
    }//for
    println("")
    println("스텝")
    for( i in 1..10 step(2) ){
        print(i)
        print(",")
    }//for
    println("")
    println("downTo")
    for( i in 10 downTo 1 step(2) ){
        print(i)
        print(",")
    }//for
    println("")
    println("while")
    var num1 = 0
    while ( num1 < 11){
        print(num1)
        print(",")
        num1++
    }

}//main