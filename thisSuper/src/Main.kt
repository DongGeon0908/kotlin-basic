fun main() {
    var obj1 = TestClass1()
    obj1.testMethod1()

    var obj2 = SuperClass()
    obj2.a1
}

class TestClass1(var a2: Int) {

    constructor() : this(100)


    var a1 = 100 // 멤버변수

    fun testMethod1() {

        // 메서드 안에 있는 변수를 먼저 사용! == 지역변수
        var a1 = 200

        println("a1 : $a1")

        // 메서드의 이름이 같을 경우, 메서드안에 만든 메서드에게 우선권을 준다!
        fun testMethod2() {
            println("testMethod1 ")
        }

        testMethod2()
    }

    fun testMethod2() {
        println("testMethod2¬")
    }
}

open class SuperClass {
    open var a1 = 100

    open fun superMethod1(){

    }
}

class SubClass : SuperClass() {
    override var a1 = 200 // 부모꺼의 변수를 나는 바꿔 쓸꺼야!

    fun subMethod1() {
        println("a1 : $a1")
    }

    override fun superMethod1() {
        println("SubClass의 superMethod1")
    }
}
