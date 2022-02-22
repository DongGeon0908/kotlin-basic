fun main() {
    val obj1 = Outer1()
    val obj2 = obj1.Ineer1()
}

class Outer1 {

    val outerMember1 = 100

    fun outerMethod1(){
        println("Outer Method!!")
    }

    inner class Ineer1 {
        val innerMember1 = 200

        fun innerMethod1(){
            println("Ineer Method")
        }

        fun innerMethod2(){
            println("outerMember1 : $outerMember1")
           // outerMember1()
        }
    }

}

