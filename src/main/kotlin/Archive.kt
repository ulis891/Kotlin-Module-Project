class Archive (val name: String?): Menu{

    var notes: MutableList<Note> = mutableListOf()

    fun getSize(): Int {
        return notes.size
    }
    override fun showMenu() {
        println("Введите цифру команды или номер заметки")
        println("0. Создать заметку")
        if (notes.isEmpty()){
            println("-. У Вас нет заметок в архиве")
            }
        else{
            for (i in 0 until getSize()){
                println("${i+1}. ${notes[i].name}")
            }
        }
        println("${getSize() + 1}. для выхода")
    }

    override fun makeElement() {
        TODO("Not yet implemented")
    }

    override fun exit(): Boolean {
        TODO("Not yet implemented")
    }
}