import java.util.*

fun main(){
    println("欢迎使用ATM")
    println("请进行交易选项")
    println("1.查询金额 ")
    println("2.存款")
    println("3.取款")
    println("4.中止交易")

    forTest()
}

fun forTest(){
        val n = readLine()
        println("选择的交易是：$n")
        val money = 10000
        for (n in 1..4){
        val result =if (n == 1) {
            println("当前余额为:$money")
        }else if(n == 2){
            val scanner = Scanner(System.`in`)
            val nu = scanner.nextInt()
            println("输入的金额是：$nu")
            println("当前余额为:$nu+$money")
        }else if(n == 3) {
            val scanner = Scanner(System.`in`)
            val num = scanner.nextInt()
            println("输入的金额是：$num")

            for (i in 1..num) {
                val result = if (num < money) {
                    println("交易正在进行")
                    val money = money - num
                } else {
                    break
                }
                println("是否继续交易：1/0")
                val scanner = Scanner(System.`in`)
                val wor = scanner.nextInt()
                if (wor == 1) {
                    println("请进行交易选项")
                    println("1.查询金额 ")
                    println("2.存款")
                    println("3.取款")
                    println("4.中止交易")
                } else {
                }
            }
        }else if (n == 4){
            break
        }else{
            println("错误，请重新输入")
        }

        }

}