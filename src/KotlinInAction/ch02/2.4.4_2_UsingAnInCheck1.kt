package ch02.ex4_4_2_UsingAnInCheck1

import ch02.ex4_4_1_UsingAnInCheck.isLetter

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know…​"
}

fun main(args: Array<String>) {
    print(isLeagalVariableName("0asd"))
}

fun isLeagalVariableName(variableName: String):Boolean {
    if (recognize(variableName[0]) != "It's a letter!") return false
    for (i in variableName){
        if (recognize(i) == "I don't know…") return false
    }
    return true
}