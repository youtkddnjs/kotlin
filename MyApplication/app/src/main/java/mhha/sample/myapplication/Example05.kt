package mhha.sample.myapplication

fun main(){
    //컬렉션
    //변경이 가능한 리스트
    val list = mutableListOf(1,2,3,4,5)
    list.add(6)
    list.addAll(listOf(7,8,9))
    println(list)

    //변경이 불가능한 리스트
    val list1 = listOf(1,2,3,4)

    println(list.joinToString(","))
    println(list.joinToString(":"))

    var listVar = list.get(0)
    var listVar2 = list[0]

    println(listVar.toString() + ", "+ listVar2.toString())
    // list에 다양한 확장 함수가 있음!
    
    // 데이터 타입이 여러개 입력 가능
    val diverseList = listOf(1, 1.5, "list", true)
    
    
    //맵
    val map = mutableMapOf( (1 to "hi"), (2 to "hello"))
    val map1 = mapOf( (1 to "hi"), (2 to "hello"))

    map.put(3, "bye")
    map[400] = "good"

    println(map)

    

}//main