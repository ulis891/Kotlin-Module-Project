import java.util.Scanner

interface Showable {
    fun showItem()
}

interface Menu: Showable {
    val objectsName: String

    var itemList: MutableList<Showable>
    var exitFlag: Boolean
    fun choiceMenu(input: Int, exitPoint: Int){
        when(input){
            0 -> this.makeElement()
            in 1 until exitPoint -> this.itemList[input-1].showItem()
            exitPoint -> exitFlag = true
        }
    }

    override fun showItem() {
        var lastMenu = "* ВЫХОД *"
        exitFlag = false
        while (!exitFlag) {
            println()
            println("----------------------------------------")
            println("Введите цифру команды или номер элемента")
            println("----------------------------------------")
            println("0. Создать")
            if (this.itemList.isEmpty()) {
                println("-. У Вас нет созданных $objectsName")
            } else {
                for ((index, archive) in this.itemList.withIndex()) {
                    println("${index+1}. $archive")
                }
            }
            if (this !is DataBase){
                lastMenu = "* НАЗАД *"
            }
            println("${this.itemList.size + 1}. $lastMenu")
        choiceMenu(inputCommand(), this.itemList.size + 1)
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
