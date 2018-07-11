fun main(args: Array<String>) {
    println("Hello the World!")
    var names = arrayOf("1", "2")
    for (name in names) {
        println(name)
    }
    aboutWhen()
    aboutIf()
    aboutFastSkip()
    aboutClass()

}

fun aboutClass() {
    var student = Student(10, "marry")
    student.say("I am greatest!!!")
    student.doString("eat")
    //函数扩展
    student.eat("food")
    println(student.toString())


}

fun Student.eat(thing: String) {
    println("i eat $thing")
}

//快速跳转代码 通过加标签  tagname@
fun aboutFastSkip() {
    val listOut = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val listIn = listOf<Int>(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    tag1@ for (outP in listOut) {
        tag2@ for (inP in listIn) {
            println("inP is $inP")
            if (inP == 5) {
                return@tag2
            }
        }
    }
    println("aboutFastSkip end")
}

fun aboutIf() {
    //if形式的三元表达式
    val a = 1
    val b = 2
    val max = if (a > b) {
        println("a is max=$a")
        a
    } else {
        println("b is max=$b")
        b
    }
}

fun aboutWhen() {
    val case = 11
    //相当于switch
    when (case) {//可以用任意表达式作为分支的条件
        1 -> println("first")
        2, 3 -> {
        }
        in 1..10 -> {
        }
        !in 11..20 -> {
        }
        else -> {
            println("case is $case")
        }
    }
    var ba: Any = "a"
    val hasPrefix = when (ba) {
        is String -> ba.startsWith("prefix")
        else -> false
    }
    //用来取代if else
    when {
//        x.isOdd() -> print("x is odd")
//        x.isEven() -> print("x is even")
//        else -> print("x is funny")
    }
}