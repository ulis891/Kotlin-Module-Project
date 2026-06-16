class Archives() : Menu{
    var archives: MutableList<Archive> = mutableListOf<Archive>()

    fun getSize(): Int{
        return archives.size
    }

    operator fun get(index: Int): Archive?{
        if(index >= 0 && index < getSize()) {
            return archives[index]
        }
        return null
    }

    fun isEmpty(): Boolean{
        return archives.isEmpty()
    }

//    override fun showMenu() {
//        println("Введите цифру команды или номер архива")
//        println("0. Создать архив для заметок")
//        if (this.isEmpty()){
//            println("-. У Вас нет архивов с заметками")
//1        }
//        else{
//        for (i in 0 until getSize()){
//            println("${i+1}. ${archives[i].name}")
//            }
//        }
//        println("${getSize() + 1}. для выхода")
//    }


    override fun makeElement(){
        var name = inputText("Введите название Архива",false)?: run {
            println("Произошла непредвиденная ошибка. Попробуем еще раз.")
            return makeElement()}
        archives.add(Archive(name))
    }

    override fun exit() : Boolean{
        return true
    }



}