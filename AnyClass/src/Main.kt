fun Main() {
    val obj1 = TestClass1()
    println("obj1 : $obj1")

    testFun(TestClass1())
    testFun(TestClass2())
    testFun(TestClass3())
}

// 코틀린에서는 모든 class가 any를 받고 있다!
class TestClass1 {
    override fun toString(): String {
        return "TestClass1의 객체입니다"
    }
}

class TestClass2 {
    override fun toString(): String {
        return "TestClass2의 객체입니다"
    }
}

class TestClass3 {
    override fun toString(): String {
        return "TestClass3의 객체입니다"
    }
}

fun testFun(a1: Any) {
    println(a1)
}