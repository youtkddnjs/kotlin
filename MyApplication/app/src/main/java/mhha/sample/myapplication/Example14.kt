package mhha.sample.myapplication

import mhha.sample.myapplication.Book.Novel.bookTitle

fun main(){
    // object
    // 클래스를 정의함과 동시에 객체를 생성
    // 싱글톤을 쉽게 만들 수 있는 키워드
    // 생성자 사용 불가
    // 프로퍼티, 메서드, 초기화 블록은 사용가능
    // 다른 클래스나, 인터페이스를 상속받을 수 있음.


    // Companion object :
    // Java의 Static과 동일한 역할
    // 클래스 내에서 하나만 생성할 수 있음.

    Counter
    println(Counter.count)
    Counter.countUp()
    println(Counter.count)
    Counter
    println(Counter.count)
    Counter.countUp()
    println(Counter.count)

    //상속받음
    Counter.hello()

    println(Book.bookTitle)

    bookTitle = "book title"

    println(Book.bookTitle)
}//main

object Counter : Hello(){
    init {
        println("카운터 초기화")
    }//init
    var count = 0
    fun countUp(){
        count++
    }

}//object Counter

open class Hello(){
    fun hello()= println("hello")
}

class Book{
    companion object Novel{
        var bookTitle = "none"
        const val BOOKNUM = 0
        fun create() = Book()
    }//companion object
}//class Book