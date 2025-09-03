fun main(args: Array<String>) {
    var tong = 0
    for(i in 1..5 step 1){
        tong+=i
    }
    println(tong)
    for(i in 1..9){
        print("${2*i} ")
    }
    println()
    var gt = 1
    for(i in 1..4){
        gt = gt*i
    }
    println(gt)
    for(i in 1 until 5){
        print("$i ")
    }
    println()
    for(i in 5 downTo 1){
        print("$i ")
    }
}