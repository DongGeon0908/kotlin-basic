fun main() {
    val obj1 = TestClass1(100, 200)
    println("obj1.a1 : ${obj1.a1}") // 언더바가 붙은 이유는 getter/setter가 붙어있음을 보여주기 위해
    println("obj2.a1 : ${obj1.a2}")

    println("-------------")

    val obj2 = TestClass2()

    obj2.v1 = 100

    println("obj2.v1 : ${obj2.v1}")
    println("obj2.v1 : ${obj2.v2}")
}

class TestClass1(var a1: Int, val a2: Int)

class TestClass2 {
    var v1: Int = 0
    val v2: Int = 100
        get() = field // field는 v2변수를 의미한다.
    var v3: Int = 200
        get() {
            println("안녕하세요!")
            return field
        }
        set(value) {
            println("set")
            field = value
        }
}

// var와 val가 클래스 변수가 됨...
// but 보조 생성자에서는 var와 val를 쓰지 못함!

