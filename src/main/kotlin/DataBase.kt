class DataBase : Menu, Showable{
    override var exitFlag: Boolean = false
    override val objectsName = "архивов"
    private val _archives: MutableList<Archive> = mutableListOf()
    override var itemList: MutableList<Showable>
        get() = _archives as MutableList<Showable>
        set(value){
            _archives.clear()
            _archives.addAll(value.filterIsInstance<Archive>())
        }


    fun getSize(): Int{
        return itemList.size
    }

    operator fun get(index: Int): Archive?{
        if(index >= 0 && index < getSize()) {
            return itemList[index] as Archive?
        }
        return null
    }

    override fun makeElement(){
        val name = inputText("Введите название Архива")
        _archives.add(Archive(name))
    }
}