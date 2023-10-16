package mhha.sample.myapplication

fun main(){
    //Scope Function : 범위 지정함수

    //1. let
    // 수신객체.let { it ->
    // 마지막줄 return
    // }

    val a = 3
    a.let {  }
    val user = UserFuc("상원",10,true)

    //수신객체.let{}
    var age2 = user.let {
        user.age
    }
    println(age2)

    //2. run
    // 수신객체.run { this ->
    //
    // }
    val user2 = UserFuc("길동",9, true)
    val user2Age = user2.run {
        age = 3
        age
    }
    println(user2Age)

    // 3. apply
    // 수신객체.apply{
    //      리턴값이 수신객체가됨.
    // }
    val user3 = UserFuc("이름",100,true)
    val user3name = user3.apply {
        name="변경"
    }
    println(user3name)
    println(user3name.name)

    // 4.also
    // 수신객체.also{ it ->}
    //  리턴값이 수신객체가됨.
    // }
    val user4 = UserFuc("얼소", 50, true)
    var user4name = user.also { hi -> //생략 불가능
        hi.name
        hi.age  = 25
    }
    println(user4name)
    println(user4name.age)

    // 5.with
    // with(수신객체){
    // 마지막줄 리턴
    // }
    val result = with(user4){
        age = 20
        true
    }
    print(result)

}//main

class UserFuc(
    var name: String,
    var age: Int,
    val gender : Boolean,
)