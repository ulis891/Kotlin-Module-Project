class Note(val text: String): Showable {
    val name: String = text.take(10)

    override fun toString(): String {
        return name
    }

    override fun showItem() {
        println(text)
    }

}