fun main(){
    //var定义变量   val定义常量（无法更改值）
    for(i in 1..4){
      //包括4；将..替换为until则不包括
    }

    for(i in 1..9 step 2){
        //间隔为2
    }

    for(i in 10 downTo 1){

    }

    val names = arrayOf("jack","kim")//类型自动推导
    //不一样的无法赋值，如果要赋值可用：   temp =score.toInt()方法
    for (item in names){
        println(item)
    }

    for (i in names.indices){
        println(names[i])
    }


    for ((index,item) in names.withIndex()){
        println("$index-$item")
    }
    val i = 10
    //if-else表达式
    val res =if(i == 0){

    }else{

    }
    //判空  a?:b成立a不成立b
    var school ="西南大学"
    val result =school.length?:"white"

    //when
    val num = 999
    when(num){
        1-> println("99")
        2-> println("98")
        3-> println("97")
        else-> println("其他")
    }

    when(num) {
        in 1..59 -> println("a")     //'a'
        in 60..99 -> println("b")   //'s'
        else -> println("无成绩")   //''
    }
    //终端输入
    val input = readLine()
    println("输入的内容为：$input")

        //使用Scanner
        //val scanner = Scanner(System.`in`)
        //val wor = scanner.nextInt()
}
