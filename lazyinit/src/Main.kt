fun main() {
    val obj1 = TestClass1()
    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")
    println("obj1.a3 : ${obj1.a3}")
}


// var -> lateinit
// val -> lazy


class TestClass1 {
    var a1 = 100
    var a2: Int
    lateinit var a3: String

    // a4라는 변수를 사용할 때 초기화가 진행된다.
    val a4: String by lazy {
        println("a4 init")
        "문자열2"
    }

    init {
        a2 = 200
    }

    fun testMethod1() {
        // :: 리플렉션을 의미한다
        if (!::a3.isInitialized) {
            a3 = "문자열"
        }
        println("a3 : $a3")
    }
}
