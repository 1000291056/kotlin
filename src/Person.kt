//在 Kotlin 中类可以有一个主构造函数以及多个二级构造函数。主构造函数是类头的一部分：跟在类名后面(可以有可选的类型参数)
abstract class Person public constructor(age: Int, name: String) {
    init {
        println("init $name is $age years old")
    }

    constructor(score: Int, age: Int, name: String) : this(age = age, name = name) {
        pScore = score
    }

    var pName: String = name
    val pAge = age
    var pScore: Int = 0
    override fun toString(): String {
        return "Person(pName='$pName', pAge=$pAge, pScore=$pScore)"
    }

    abstract fun say(msg: String)
    open fun doString(thing: String) {
        println("Person I do $thing")
    }
}