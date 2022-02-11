import kr.co.heaven.TestPublicClass3
import kr.co.testt.PublicClass3

fun main() {
    val obj1 = TestClass(3, 4)
    println("obj1 = ${obj1.a1}")
    println("obj1 = ${obj1.a2}")
    println("obj1 = ${obj1.a3}")
}

open class TestClass(val a1: Int, var a2: Int) {
    var a3: Int = 0
}


fun accessTest() {
    PublicClass1()

    // 특정 모듈안에서만 사용가능
    InternalClass1()

    TestPublicClass3()

    PublicClass3()


    val t1 = TTestClass()

    t1.internal1
    t1.public1
    t1.internal1
    t1.preotected1
}

class SubClass1 : TTestClass() {

}

// internal은 모듈안에서만 사용 가능
// 그외 접근제한자는 자바와 같음