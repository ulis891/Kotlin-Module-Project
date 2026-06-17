class Archive (val name: String, ): Menu, Showable{
    override var exitFlag: Boolean = false

//    override var itemList: MutableList<Note> = mutableListOf()
    private val _archives: MutableList<Note> = mutableListOf()
    override var itemList: MutableList<Showable>
        get() = _archives as MutableList<Showable>
        set(value){
            _archives.clear()
            _archives.addAll(value.filterIsInstance<Note>())
        }

    override fun toString(): String {
        return name
    }

    override fun makeElement(){
        val input = inputText("Введите заметку")
        itemList.add(Note(input))
    }
}