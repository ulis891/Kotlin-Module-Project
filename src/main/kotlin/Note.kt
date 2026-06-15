class Note(val name: String, val text: String ) {

    constructor(text: String) : this(text.take(10), text) {
    }
    fun showNote(){
        println(name)
        println()
        println(text)
    }

}