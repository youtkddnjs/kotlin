package mhha.sample.myapplication

fun  main(){
    println("Hello")

    // 3. 변수
    // val = value(값)
    // var = variable(변경가능)

    // 2. 함수
    test(4, c= 10) // b는 3가 입력되고 c 10이 할당됨.
    test2( id = 10, name = "none", age = 1) // 매개변수의 이름을 지정하여 인수(argument)를 넣는경우 순서가 바뀌어도 상관 없음.
    println(test3(4,5))

}//main





// 2. 함수
fun test(a: Int, b: Int = 3, c: Int = 1) : Unit {
    // Unit 은 자바에서 void 생략 가능
    // Unit 대신 return 타입 지정 할 수 있음.
    // 매개변수(parameter)를 (java) int a == (kotlin) a: Int
    // java 에서 오버로딩 대신 b: Int = 3 으로써 기본 값을 주어 사용 가능
}//test


/*fun test2( name: String ,age : Int, id : Int){
    println( name + age + id )
    //한줄로 변경 가능
}//test2 */

fun test2( name: String ,age : Int, id : Int) = println( name + age + id ) //test2

fun test3(a:Int, b:Int) = a * b