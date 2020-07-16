/*public class Util{
    public static String URL = "www.com";
    public static void loadDate(){
        system.out.println("下载图")
    }//静态方法
    //实例方法  必须实例化的对象 用这个对象创建
    public void show(){

    }
}

fun main(){
    Util.URL  //静态直接调用
}
*/
/*
fun main(){
    HttpRequest.vrl
    HttpRequest.loadDate()
}
class HttpRequest{
    companion object{                   //该方法将其中的内容变为静态从而可以直接调用      若无该方法用其对象即 HttpRequest().vrl
        var vrl :String = "www.baidu.comm"
        @JvmStatic                     //方法转换为静态需要 仅仅在companion object这个类中用
        fun loadDate(){
            println("下载失败")
        }
    }
}
//静态类  内部全静态
object Img{
    fun scale(){

    }
    fun saveBitmapToFile(){

    }
}

//饿汉式   懒汉式         单例
/*class Person private constructor(){
    companion object{
        val instance = Person()
    }
}

class Sqlite private constructor(){
    companion object{
        var default:Sqlite2 by lazy(LazyThreadSafetyMode.SYNCHRONIZED){
            Sqlite2()
        }
        fun show(){
            println("helld")
        }
    }
}
fun main(){
    Person()
    Sqlite2.default.show()
}*/
//扩展：已有类基础上添加属性和方法  fun方法val var属性  并未添加到这个类

class Student(var name:String){
    fun work(){

    }

    companion object{       //存在 可添加静态

    }
}
fun Student.Companion.show(){
    println("test")
}
val Student.Companion.vrl:String
get() = "www.baidu.com"               //静态

fun Student.eat(){   //扩展方法

}

fun work(){                    //扩展方法与扩展属性与原有的相同 原有的优先级高 以原来为主
    println("enjoy")
}

val Student.grade:Int         //无法实例化，无法存值 无法初始化 必须为扩展属性提供set get方法
get(){
    println("")
    return  1
}

var Student.score:Float
get() = 86.6f
set(value){
    name = "${name}...${value}"
}*/
/*
fun main(){
    val s = Student(name:"king")
    s.grade
    s.score = 55f


    Student.show()
    Student.vrl.also{println(it)}
}*/

//高阶函数
fun login(name: String){
    val id = 2

    fun loadHomeData(id:Int):String{
        println("加载主页数据")
        return ""
    }
}
fun main(){

}
