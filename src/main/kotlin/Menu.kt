import java.util.Scanner

interface Menu {
    fun choiseMenu(){

    }
    fun <T> showMenu(list: MutableList<T>) {
        while (true) {
            println("Введите цифру команды или номер элемента")
            println("0. Создать")
            if (list.isEmpty()) {
                println("-. У Вас нет созданных объектов")
            } else {
                for (i in 0 until list.size) {
                    println("${i + 1}. ${list[i]}")
                }
            }
            println("${list.size + 1}. для выхода")
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
    fun makeElement()
    fun exit(): Boolean
}
