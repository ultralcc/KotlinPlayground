package KotlinInAction.ch02

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println("Hello, ${args[0]}!")
    }
    val a = "123"
    val b = "abd $a"
    print(b)
}
