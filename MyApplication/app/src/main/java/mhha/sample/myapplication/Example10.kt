package mhha.sample.myapplication

fun main(){
    //확장함수 Extension Function
    //기존에 정의되어 있는 클래스에 함수를 추가하는 기능


    testClass().hello()

    // testClass에 hi() 메소드 추가함.
    fun testClass.hi() = println("하이")

    testClass().hi()

}//main

class testClass() {
    fun hello() = println("안녕")
    fun bye() = println("잘가")
}//testClass