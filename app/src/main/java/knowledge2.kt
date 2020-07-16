import android.icu.text.CaseMap

/*class Bank{
    var money:Money?= null

    class Money(var num:Int){

    }
    //嵌套类：写在一个类里面的类
    //独立无法访问宿主类的属性与方法
    class Card(){

    }

    //内部类
     inner class Cards(){
        fun save(count:Int){
            money.num += count
        }

        fun withdraw(count:Int){
            if (money.num >= count){
                money.num -= count
                println("取款成功，余额为${money.num}")
            }else{
                println("余额不足")
            }

        }
    }

}

fun main(){
    val card = Bank().Cards()
    card.save(count:200)
    card.withdraw(count:30)
}*/


fun show(){

}
//Unit = void
fun buy(money:Int):Unit{

}
fun study(money:Int):Int{
    return 100
}

fun add(a:Int,b:Int):Int{
    return a + b
}
/*
fun work(money: Int,name:String,type:String ="English"){

}

fun main() {
    work(money=10000, name="kim")     //没有默认值时依次访问，前面一个有，可直接访问后一个即work(name = "kim")
}*/

//可变参数
/*fun add(vararg names: Int){
var result = 0;
for (value in names){
result += value
}
    println(result)
}
fun main(){
    add(...names:1,2,3,4)         //输出结果为10
}*/
fun showView(){
    fun loadDate() = "图片"
    fun showList() {
        //下载数据
      loadDate().also {
          println("显示下载的内容：$it")      //下载马上利用
      }     //val img = loadDate()
           // println("显示下载的内容：$img")
    }
    showList()
}
//数据类
//主构造至少有一个参数
//参数必须使用var或val修饰
//不能使用qpen inner abstruct修饰
/*data class  User(
    var name:String,
    var password:String,
    var id :Int){

}

fun main(){
    User(name:"jack",password:"111",id:1).name  //访问    also方法打印
}*/

//接口无法实例化  只能实例化接口的实现类

interface  OnTouchListener{
    fun onTouchEvent(type:String)
}

/*fun didTouch(listener: OnTouchListener){
    listener.onTouchEvent(type:"手指按下")
}


//方法一    定义类实现接口->实例化这个类
class ButtonListener:OnTouchListener{
    override fun onTouchEvent(type: String) {
        println("接受的事件为：$type")
    }
}

fun main(){
   /* var btn = ButtonListener()
    didTouch(btn)*/
    ButtonListener().apply { didTouch(this) }
    //ButtonListener().also { didTouch(it) }

    didTouch(object :OnTouchListener{
        override fun onTouchEvent(type: String) {
            println("接受的事件为：$type")
            }
    })                 //匿名类实现        在类里面为匿名内部类

}*/

//抽象类(默认open)中可定义 ：抽象方法：子类必须实现（不能实现） 普通方法 抽象属性（不能初始化）
abstract class BaseActivity{
    init {
        onPause()
        onCreate()              //默认调用 继承了就会调用
    }
    fun run(){
        onCreate()
    }
    abstract  fun onCreate()

    open fun onPause(){              //重写其中普通方法

    }

    fun onDestory(){

    }
}

class LdginActivity/*(override var title: String)重写属性*/:BaseActivity(){
    override fun onCreate() {
        //必须实现
    }

    override fun onPause() {

    }


}

