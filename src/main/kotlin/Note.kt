class Note(val name: String, val text: String): Showable {

    override fun toString(): String {
        return name
    }

    override fun showItem() {
        println()
        println("**********************")
        println("Заметка: $name")
        println()
        println(text)
        println("----------------------")
    }

}