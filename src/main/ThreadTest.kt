package main

import java.io.File
import java.nio.charset.Charset

@Volatile
var content: String = "";

fun main(args: Array<String>) {
    var th = object : Thread({
        NetIO.main()
        println("-----------threadid=" + Thread.currentThread().id)
        println(read())
    }) {

    }
    th.start()
}

@Synchronized
fun read(): String {
    content = File("C:\\Users\\temp\\Desktop\\3dconfig.xml").readText(Charset.forName("utf-8"))
    return content
}