package KotlinDictionary


fun main(args: Array<String>) {

    // Chapter 1 : Introduce

    var intVar : Int          // var為宣告變數(可更改)
    val doubleVal : Double    // val為宣告常數(不可更改)

    val intWithInit = 10                //宣告時給初值就不用給型態
    val intWithInitAndType : Int = 10   //也可以給型態再給初值

    val int : Int = 10
    val long : Long = 10
    val float : Float = 10.0F
    val double : Double = 10.0          //Kotlin的資料型態
    val boolean : Boolean = true
    val char : Char = 'a'
    val string : String = "abc"

    val intArray : IntArray = intArrayOf(1,2,3)             //陣列的宣告方式與賦值方式
    val stringArray : Array<String> = arrayOf("123","abc")  //字串陣列的宣告方式(特例)


    ///////PlayGround///////

//    println("$intWithInit $intWithInitAndType $int $long $float $double $boolean $char $string")

    ////////////////////////


    //Chapter 2 : 簡單變數之間的轉換

    val imInt : Int = 30
    val imLong : Long = imInt.toLong()
    val imFloat : Float = imInt.toFloat()
    val imDouble : Double = imInt.toDouble()        //資料型態的強制轉型,須注意適不適合
    val imChar : Char = imInt.toChar()
    val imString : String = imInt.toString()

    ///////PlarGround///////

//    println("$imInt $imLong $imFloat $imDouble $imChar $imString")

    ////////////////////////


    //Chapter 3 : 字串的處理

    var str :String = "tv_origin.text"
    var strtest : String = ""
    var strsplit : List<String>
    str.indexOf('v')                                //使用字串的value找到某個字的index
    strtest = str.substring(0,str.indexOf('.'))     //擷取字串string.substring(index of head , index of tail(不包含))
    strsplit = str.split('.')                  //分割字串 ,回傳值為List<String> 型態的佇列
    ///////PlayGround///////

    print(strtest)
    print(strsplit)
    ////////////////////////



}