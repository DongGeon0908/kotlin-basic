fun test1(str: String?) {
    val value = str ?: "요것이!"
}

fun test2(str: String?) {
    val value = str?.length
}

// !! ?: ?.


fun main() {
    val obj1:SubClass1 = SubClass1()
    val obj2:SubClass2 = SubClass2()

    val super1:SuperClass1 = obj1
    val inter1:Inter1 = obj2

//    val obj3:SubClass1 = super1 -> 자동형변환 불가능
//    val obj4:SubClass2 = inter1 -> 자동형변환 불가능


}

open class SuperClass1
interface Inter1

class SubClass1 : SuperClass1()
class SubClass2 : Inter1