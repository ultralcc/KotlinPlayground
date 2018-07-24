
var intArr : IntArray = intArrayOf(33,42,123,42)

fun main(args: Array<String>) {
    for ((index,value) in intArr.withIndex()){
        print("$index ")
        println(value)
    }

}