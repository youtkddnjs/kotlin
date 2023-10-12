package mhha.sample.myapplication

fun main(){
    // 클래스 class
    val user = User("상원", 21)

    val kid = Kid("상순", 1, true)
    println(kid.name + kid.age + kid.gender)

}//main

open class User(open val name : String,open var age: Int)

// 상속 : 코틀린에서 상속을 보통 권장하지 않음.
// kid를 생성할 때 부모 값을 받기 위해 open 과 override 를 사용한다.
class Kid(override val name: String, override var age: Int) : User(name, age){
    var gender: Boolean = false

    // 부생성자 secondary constructor
    constructor(name: String, age: Int, gender: Boolean) : this(name, age){
        this.gender = gender
        println("부생성자")
    } //constructor

    // class 에서 가장 먼저 선언 되는 init
    init{
        println("초기화")
    }
}
