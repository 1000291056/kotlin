/**
 * 1,主构造函数必须至少有一个参数，并且标注var或val
 * 2，不能继承其他class 但可实现接口
 * 3,数据类不能是 abstract，open，sealed，或者 inner ；
 * 4,在 JVM 中如果构造函数是无参的，则所有的属性必须有默认的值
 */
data class DataObject constructor(var name:String,var age:Int) {
}