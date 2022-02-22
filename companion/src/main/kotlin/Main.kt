fun main() {
    val obj1 = TestClass()
    println("obj1.a1 : ${obj1.a1}")

    obj1.a1 = 200
}

class TestClass {
    var a1 = 100

    companion object {
        var a2 = 1000

        fun testFun2() {
            println("testFun2")
        }
    }

    fun testFun1() {
        println("testFun1")
    }
}