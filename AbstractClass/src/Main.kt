fun main() {

}

abstract class Super1 {
    open fun method1() {
        println("method1")
    }

    open fun method2() {
        println("method2")
    }

    abstract fun method3()
}

class Sub2 : Super1() {
    override fun method1() {
        println("override with method1")
    }

    override fun method3() {
        println("추상클래스")
    }

}

fun testFun(obj1: Super1) {
    obj1.method1()
    obj1.method2()
}