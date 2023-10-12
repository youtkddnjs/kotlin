package mhha.sample.myapplication

import java.time.DayOfWeek

fun main(){
    //조건식
    max(3,4)
    isHoliday("화")

}//main

fun max(a: Int, b: Int){
    //java 에서 흔히 사용되는 조건문(statement) 고
    if(a == b) {
        println("같음")
    }else if (a > b) {
        println("a 가큼")
    }else if (a < b) {
        println("b가 큼")
    }else{
        println("예외")
    }

    //kotlin에서는 조건식(expression) 이므로 결과값을 반환 받을 수 있음.
    val res = if(a == b) {
        println("같음")
    }else if (a > b) {
        println("a 가큼")
    }else if (a < b) {
        println("b가 큼")
    }else{
        println("예외")
    }
    println(res)

    val ress = if(a == b) println("같음") else if (a > b) println("a 가큼") else if (a < b) println("b가 큼") else println("예외")
    println(ress)

    val ress2 = if(a == b) println("같음") else if (a > b) a else if (a < b) b else println("예외")
    println(ress2)

} //max

fun isHoliday(day: String){
    //switch문 대신 when이 있음.
    val res = when(day){
        "월" -> "평일"
        "화","수" -> "화수"
        "일" -> if(day == "일") "좋아" else "안좋아"
        // 아래 처럼 범위로 지정 가능
        // in 2..4 ->
        // in listOf(1,2,3,4) ->
        else -> "주말" //expression 사용하는 경우는 else가 반드시 있어야함. statement 일 때는 생략가능

    }//when
    println(res)
}//isHoliday