fun main(args: Array<String>) {
    var a = arrayOf(1,2,3)
    var count = 0
    for ((index,value) in a.withIndex()){
        println(index)
        println(value)
    }

}