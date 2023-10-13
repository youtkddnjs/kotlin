package mhha.sample.myapplication

import android.view.View

fun main() {
    // 람다 == 익명함수
    // 람다는 변수로 사용 가능
    // 한 번 사용 되고, 재사용되지 않늠 함수
    var a1 = fun() {println("hello")}
    //   입력값타입  출력타입   가장 마지막 값이 리턴값이 됨
    var b : (Int) -> Int = { it * 10 }
    println(b(20))


    var b2 : (Int,Int) -> Int = { a, b -> b
        a*b
    }
    println(b2(2,3))


    var d = {i: Int , j: Int -> i*j}
    println(d(4,5))

    // 사용하지 않겠다로 생략하는 기호 _ 입니다.
    var f : (Int, String, Boolean) -> String = { _, b, _ -> b}

    //SAM
    //Single Abstract Method
    //단일 추상 메서드
    //자바 함수형 인터페이스 관계에서 유래됨
    //함수형 인터페이스를 인자로 받는 자바 함수를 호출 할 때 인터페이스 객체를 람다로 넘길 수 있다

//    val view = View(this)
    // Java 에서
//        view.setOnClickListener {
//            new View.onClickListener(){
//                @Override
//                public void onClic(View:view){
//
//                }
//            }
//        }
    // Kotlin 에서
//    view.setOnClickListener({println("클릭")})

}//main