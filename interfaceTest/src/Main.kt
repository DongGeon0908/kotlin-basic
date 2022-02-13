fun main() {

}

open abstract class AbstractClass1() {
    open abstract fun abstractMethod1()
}

open abstract class AbstractClass2() {
    open abstract fun abstractMethod2()
}

fun testFun1(obj1: AbstractClass1) {
    obj1.abstractMethod1()
}

fun testFun2(obj2: AbstractClass2) {
    obj2.abstractMethod2()
}

class Testclass1 : AbstractClass1() {
    override fun abstractMethod1() {
        println("override")
    }
}

class Testclass2 : AbstractClass2() {
    override fun abstractMethod2() {
        println("override")
    }
}

interface Inter1 {
    fun inter1Method1() {
        println("일반 메서드")
    }

    fun inter2Method2()
}

interface Inter2 {
    fun inter2Method1() {
        println("일반 메서드")
    }

    fun inter2Method2()
}

class TestClass3 : Inter1 {
    override fun inter2Method2() {
        TODO("Not yet implemented")
    }
}

class TestClass4 : Inter1, Inter2 {
    override fun inter1Method1() {
        TODO("Not yet implemented")
    }

    override fun inter2Method2() {
        TODO("Not yet implemented")
    }

}