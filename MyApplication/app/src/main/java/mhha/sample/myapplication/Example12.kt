package mhha.sample.myapplication

var text: String? = null
lateinit var text2: String
lateinit var age2: Integer

val testLazy : Int by lazy{
    println("초기화 중")
    100
}


fun main(){
    println("메인 함수")
    text = "name"
    text2 = "hi"
    age2 = Integer(10)
    println("초기화 한 값 $testLazy")
    println("두번째 호출 $testLazy")
}//main