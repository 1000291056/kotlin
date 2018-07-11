//�� Kotlin ���������һ�������캯���Լ�����������캯���������캯������ͷ��һ���֣�������������(�����п�ѡ�����Ͳ���)
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