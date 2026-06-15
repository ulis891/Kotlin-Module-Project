import java.util.Scanner

interface Menu {
    fun showMenu()
    fun makeElement()
    fun exit(): Boolean
    fun inputCommand(): Int {
        val input = Scanner(System.`in`).nextLine().toIntOrNull()
        if (input != null) {
            return input
        }
        println("Команда должна быть числом!")
        return inputCommand()
    }

    fun inputText(title: String, isEmpty: Boolean = true): String? {
        println(title)
        if (isEmpty) {
            return Scanner(System.`in`).nextLine()
        } else {
            val input = Scanner(System.`in`).nextLine()
            if (input.isNullOrBlank()){
                println("Ввод не может быть пустым!")
                return inputText(title,false)
            }
            return input
        }
    }
}