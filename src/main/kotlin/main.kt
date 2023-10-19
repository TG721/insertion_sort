fun main() {
    val list = mutableListOf<Int>(6, 3, 2, 763, 2, 343, 23)

    for (i in 1 until list.size){
        val temp = list[i]
        var j = i - 1

        while(j >= 0 && list[j] > temp ){
            list[j+1] = list[j]
            j--
        }
        list[j+1] = temp
    }

    print(list)
}