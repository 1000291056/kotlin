fun main(args: Array<String>) {
    println("Hello the World!")
    var names = arrayOf("1", "2")
    for (name in names) {
        println(name)
    }
    var map = hashMapOf<String, Student>();
    map.put("1", Student(1, "1"))
    map.put("2", Student(3, "2"))
    for (m in map) {
        println("map :" + m)
    }
    for ((key, value) in map) {
        println("map :" + "key is $key" + "   value is " + value)
    }
    aboutWhen()
    aboutIf()
    aboutFastSkip()
    aboutClass()
    aboutInterface(object : Listener {
        override fun OnListener(msg: String) {
            println("msg::::")
        }
    })
    aboutInterface { msg: String ->
        println(msg)
    }
    aboutHighFun {
        "Hello high fun"
    }
    aboutExtent(D(""))
    aboutDataObject()
    aboutObjectExp(object : Person(1, "A"), Listener {
        override fun say(msg: String) {
            println("aboutObjectExp Person say:" + msg)
        }

        override fun OnListener(msg: String) {
            println("aboutObjectExp OnListener:" + msg)
        }

    })
    aboutMultipleDeclarations()
    aboutNUllSafe()
}

/**
 * �հ�ȫ
 */
fun aboutNUllSafe() {
    var str: String? = null
}

//��������
fun aboutMultipleDeclarations() {
    val (age, name) = Student(1, "Multiple declarations")
    println("Multiple declarations $name is $age years old")
}
//fun aboutDynamic(p: dynamic) {
//    when {
//        p is Student -> p.say("dynamic")
//    }
//}

fun D.foo() {
    println("ddddd")
}

fun C.foo() {
    println("ccccc")
}

fun aboutDataObject() {
    var dataObject = DataObject("С��", 1)
    var dataObjectC = dataObject.copy(age = 2)
    println(dataObjectC.toString())
}

fun aboutObjectExp(any: Any) {
    when {
        any is Person -> any.say("aboutObjectExp is person")
        any is Listener -> any.OnListener("aboutObjectExp Listener")
    }
}

fun aboutExtent(c: C) {
    c.foo()

}

//�߽׺��� �����Ժ���Ϊ���� ������һ������
inline fun aboutHighFun(body: () -> String) {
    println("aboutHighFun:" + body())
}

fun aboutInterface(listener: Any) {
    when {
        listener is Listener -> listener.OnListener("sb")
    }

}

fun aboutInterface(listener: Listener) {
    if (listener != null) {
        listener.OnListener("sb")
    }
}

fun aboutClass() {
    var student = Student(10, "marry")
    student.say("I am greatest!!!")
    student.doString("eat")
    //������չ
    student.eat("food")
    println(student.toString())


}

fun Student.eat(thing: String) {
    println("i eat $thing")
}

//������ת���� ͨ���ӱ�ǩ  tagname@
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
    //if��ʽ����Ԫ���ʽ
    val a = 1
    val b = 2
    val max = if (a > b) {
        println("a is max=$a")
        a
    } else {
        println("b is max=$b")
        b
    }
    if (a > 0) {

    }
}

fun aboutWhen() {
    val case = 11
    //�൱��switch
    when (case) {//������������ʽ��Ϊ��֧������
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
    //����ȡ��if else
    when {
//        x.isOdd() -> print("x is odd")
//        x.isEven() -> print("x is even")
//        else -> print("x is funny")
    }
}