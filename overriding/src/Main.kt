fun main() {
    val obj1 = SubClass1()
    println(obj1.subA1)
    obj1.subMethod1()


    println("--------------------")


}

open class SuperClass1 {
    var superA1 = 100

    fun superMethod1() {
        println("Superclass1의 superMethod1 입니다.")
    }
}

class SubClass1 : SuperClass1() {
    var subA1 = 200

    fun subMethod1() {
        println("SubClass1의 submethod1 입니다.")
    }
}

open class SuperClass2 {
    // open이 있어야 Overriding이 가능하다
    open fun superMethod2() {
        println("SuperClass2의 superMethod2")
    }
}

class SubClass2 : SuperClass2() {
    override fun superMethod2() {
        println("오버라이드~~")
    }
}

open class SuperClass3 {

    open fun superMethod3() {
        println("SuperClass3의 superMethod3")
    }
}

class SubClass3 : SuperClass3() {
    override fun superMethod3() {
        super.superMethod3() // 부모꺼도~
        println("Wow")
    }
}

fun overridingTest(obj1: SuperClass3) {
    obj1.superMethod3()
}