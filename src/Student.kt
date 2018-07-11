class Student(age: Int, name: String) : Person(age, name) {
    override fun say(msg: String) {
        println("I say $msg")
    }

    override fun doString(thing: String) {
        super.doString(thing)
        println("Student I do $thing")
    }
    companion object Factry{//°éËæ¶ÔÏó

    }
}