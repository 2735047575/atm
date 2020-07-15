/*class Bank{
    var money:Money?= null

    class Money(var num:Int){

    }
    //嵌套类：写再一个类里面的类
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

fun work(money: Int,name:String,type:String ="English"){

}

fun main() {
    work(money=10000, name="kim")     //没有默认值时依次访问，前面一个有，可直接访问后一个即work(name = "kim")
}

//可变参数
fun add(vararg name: Int){
var result = 0;
for (value in names){
result += value
}
}

