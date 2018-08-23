package main

import java.io.File
import java.net.URL
import java.nio.charset.Charset

fun main(args: Array<String>) {
    IO.main()
    NetIO.main()
}

class IO {
    companion object {
        fun main() {
            val fileName = "C:\\Users\\temp\\Desktop\\3dconfig.xml";
            val file = File(fileName);
            val content = file.readText(Charset.forName("utf-8"));
            println(content)
            val lines = file.readLines(Charset.forName("utf-8"))
            for (line in lines) {
                println("___:$line")
            }
            val filetreewalk = (File("C:\\Users\\temp\\Desktop")).walk().filter { file: File -> file.isDirectory }
            val it = filetreewalk.iterator()
            while (it.hasNext()) {
                println(it.next().absolutePath)
            }
//            file.bufferedReader()
//            file.bufferedWriter()
        }
    }

}

class NetIO {
    companion object {
        fun main() {
            val wehther = "http://www.weather.com.cn/data/sk/101190408.html"
            var connect = URL(wehther)
            println(connect.readText(Charset.forName("utf-8")))
            var file = File("C:\\Users\\temp\\Desktop\\read.text")
            file.writeBytes(connect.readBytes())
        }

    }
}