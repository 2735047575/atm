fun main(){
    //无参数
    val king =Person3()
    //有参数
    //val bz = Car(brand:"奔驰"，wheel:"4",color:"black")
}

//默认提供一个构造函数
//主构造:头部    次构造（必须显示调用主构造函数）：内部
class Person{

}

class Person1(){

}
//经constructor显示指明为构造函数，且有修饰时其不可省略
class Person2 constructor(){

}
//3个构造函数
class Person3(){
    constructor(name:String):this(){

    }
    constructor(name:String,age:Int):this(){

    }
   /* fun main(){
        val lcx = Student(name = "李存孝")
        println(lcx.name)

        lcx.name = "李世民"
        println(lcx.name)
    }


    class Student(var name: String){

    }*/
  /* fun main(){
       val lcx = Student(name = "李存孝")
       println(lcx.name)

       lcx.name = "李世民"
       println(lcx.name)

       val lsm = Student(wife = "zswh")    //当前一个name存在默认值情况下，可直接跳过而给wife赋值
   }


    class Student(var name: String = "李渔",var wife:String = ""){        // = 附加默认值，有默认值情况下，不给lcx括号内的内容依然有值

    }*/
    //有参数,局部变量
    //外部无法访问，对象初始化时可以访问
    class Car(brand:String){
        init {
            println(brand)
        }

        constructor(brand:String,color:String):this(brand){

        }
    }

   // 在已有类的基础上添加新的方法与属性：继承；函数扩展
    //kt中类默认无法继承
    /*open class Animal(){

   }
    open class Father(var name: String,var age:Int = 30):Animal(){          //间接多继承
       //默认情况下无法重写，需要open修饰
       open fun work(){
       println("干活")
       }
   }
    class Kid(name:String):Father(name,age:40){       //只能单继承

        //子类重写父类方法要用override修饰
        override fun work(){
        //子类调用父类时使用
        super.work()
        println("笑红尘")
        }
    }
    */
}

//多态:统一接口
/*open class Animal(){
    open fun sleep(){
        println("冬眠")
    }
}

class Dog():Animal(){
    override fun sleep() {
        println("在家休息")
    }
}

fun whereTosleep(animal: Animal){
    animal.sleep()
}

fun main(){
    val an = Animal()
    val dg = Dog()

    whereTosleep(dg)
}*/

//接口
interface OnClickListener{
    fun onClick()
}

class Button:OnClickListener{
    override fun onClick(){
        println("按钮被点击了")
    }
}

fun test(listener: OnClickListener){
    listener.onClick()
}
//set get方法
/*class Shape(){
    var name:String = "king"  //定义时直接给值
    set(value) {field = value.toUpperCase()}    //默认情况下，任何一个属性都有一个内部变量 名字为field    后半部分为转换为大写
    get() = field.toLowerCase()                 //此变量只能初始化时调用 set/get

    var passward:String ="37929208984"
    private set                   //设置外部只读，内部可改，val内部也无法更改
}

fun main(){
    val shape = Shape()
    shape.name = "King"   //set只有变量
    println(shape.name)    //get常量和变量
}*/

//可空类型
class Boy{
    //可空类型
    var girlfriend:String?=null
    fun show() {
        println(girlfriend?.length)    //判断是否空
        println(girlfriend!!.length)   //一定不是空
    }
}/*
fun main(){
    val tt = Myclass.look()
    //不为空才执行对应方法
    println(tt?.length)
}*/
/*
class Activity{
    //懒加载
    val data:String by lazy {
        "图"
    }

    //延迟加载  必须在某个时期初始化
    lateinit var imgData:String

    fun showActivity(){
        imgData = "测试数据"     //初始化
        println("显示下载的数据:$data")
    }
}

fun main(){
    Activity().showActivity()
}*/
