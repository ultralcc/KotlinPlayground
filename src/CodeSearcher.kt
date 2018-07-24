
fun main(args: Array<String>) {

    var theList  = arrayOf("0")
    var theListName = arrayOf("0")
    while (true) {
        print("\n請輸入統一編號:")
        val code = readLine().toString()
        if (code == "0") {
            print("請輸入欲新增的統編:")
            val newCode = readLine().toString()
            print("請輸入公司名稱:")
            val newName = readLine().toString()
            theList = theList.plus(newCode)
            theListName = theListName.plus(newName)
        }else{
            var find = 0
            for ((index, value) in theList.withIndex()) {
                if (value == code) {
                    find = index
                }
            }
            if (find != 0) {
                print(theListName[find])
            } else {
                print("查無資料")
            }
        }
    }
}