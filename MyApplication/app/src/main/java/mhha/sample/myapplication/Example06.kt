package mhha.sample.myapplication

fun main(){
    //Null
    //var name : String = null 불가
    var name : String? = null //가능

    // Null일 때
    val result1 = if (name == null) "값이 없음" else name
    // 위 내용을 아래로 줄일 수 있음.
    val result2 = name?: "값이 없음"
    // null 변수에 대한 함수 사용 시
    val size1 = name?.length
    // null이 절대 아님을 나타냄을 표시 !!
    val size2 = name!!.length

}//main
