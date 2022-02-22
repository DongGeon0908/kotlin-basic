fun main() {
    val t1 = TestClass1<Int>()
    t1.testMethod(100)

    val t2 = TestClass1<String>()
    t2.testMethod("문자열")
}

// A ~ Z
class TestClass1<T> {

    fun testMethod(a1: T) {
        println("a1 : $a1")
    }
}

// 생성되면서 타입이 정해짐
class TestClass2<T>(var a1: T) {
    fun testMethod2(a2: T) {
        println()
    }
}

class TestClass<A, B>(var a1: A, var b1: B) {

}

// 불변성
// 공변성