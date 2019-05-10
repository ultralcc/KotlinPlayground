@file:JvmName("ProcessTheAnswer")
package KotlinInAction.ch08

/* Kotlin declaration */
fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}
