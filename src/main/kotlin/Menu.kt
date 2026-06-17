import java.util.Scanner

interface Showable {
    fun showItem()
}

interface Menu: Showable {
    var itemList: MutableList<Showable>
    var exitFlag: Boolean
    fun choiseMenu(input: Int, exitPoint: Int){
        when(input){
            0 -> this.makeElement()
            in 1 until exitPoint -> this.itemList[input-1].showItem()
            exitPoint -> exitFlag = true
        }
    }

    override fun showItem() {
        exitFlag = false
        while (!exitFlag) {
            println("Введите цифру команды или номер элемента")
            println("0. Создать")
            if (this.itemList.isEmpty()) {
                println("-. У Вас нет созданных объектов")
            } else {
                for (i in 0 until this.itemList.size) {
                    println("${i + 1}. ${this.itemList[i]}")
                }
            }
            println("${this.itemList.size + 1}. для выхода")
        choiseMenu(inputCommand(), this.itemList.size + 1)
        }
    }

    fun inputCommand(): Int {
        val input = Scanner(System.`in`).nextLine().toIntOrNull()
        if (input != null) {
            return input
        }
        println("Команда должна быть числом!")
        return inputCommand()
    }

    fun inputText(title: String): String {
        println(title)
        val input = Scanner(System.`in`).nextLine()
        if (input.isNullOrBlank()){
            println("Ввод не может быть пустым!")
            return inputText(title)
        }
        return input
    }
    fun makeElement()
}
