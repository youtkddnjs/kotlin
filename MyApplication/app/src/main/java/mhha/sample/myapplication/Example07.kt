package mhha.sample.myapplication

fun main(){
    //타입체크
    println(check("hi"))
    println(check(3))
    println(check(true))

    //체크
    println()
    cast("hi")
    cast(3)


}//main

/*fun check( a: Any): String {
    return if(a is String){
        "문자열"
    }else if (a is Int){
        "숫자"
    }else{
        "모름"
    }
}//check*/

fun check( a: Any): String {
    return when (a) {
        is String -> {
            "문자열"
        }

        is Int -> {
            "숫자"
        }

        else -> {
            "모름"
        }
    }
}//check

fun cast(a: Any){
    val result = a as? String ?: "실패"
    println(result)
}//cast

fun smartcast(a : Any){
    if (a is String){
        a.length // 이미 if 조건식에서 체크를 했기때문에 가능
    }else{
        -1
    }
}