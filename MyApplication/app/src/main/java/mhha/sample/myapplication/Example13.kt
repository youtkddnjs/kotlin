package mhha.sample.myapplication

fun main(){

    // data class
    // copy , toString hashCode, equals 가 자동으로 생김 재사용하기 가능
    // 프로퍼티가 최소 하나는 있어야함.
    // 상속이 불가능

    var person = Person("인간", 24)
    var dog = Dog("멍멍이",12)

    println(person.toString())  // mhha.sample.myapplication.Person@3d24753a

    println(dog.toString()) //Dog(name=멍멍이, age=12)

    println(dog.copy(age = 6).toString())

    // sealed class
    // 추상 클래스

    val cat:Cat = BlueCat()
    val result = when (cat){
        is BlueCat -> {"Blue"}
        is RedCat -> {"Red"}
        is GreenCat -> {"Green"}
        else -> {"none"} // sealed를 사용하면서 부터 필요가 없어짐.
    }
    println(cat)
    println(result)


}//main

class Person(
    val name: String,
    val age : Int,
)//class Persion

data class Dog(
    var name : String,
    val age : Int,
) {//data class Dog
/*    override fun toString(): String {
        return "직업 구현, $name"
    }*/
}

//추상클래스
sealed abstract class Cat
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()