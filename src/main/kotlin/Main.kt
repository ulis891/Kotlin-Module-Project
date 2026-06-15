fun main(args: Array<String>) {
    var archiveList: Archives = Archives()
    var exit_baton = false
    while (!exit_baton){
        archiveList.showMenu()
        var command = archiveList.inputCommand()
        when(command){
            0 -> archiveList.makeElement()
            archiveList.getSize()+1 -> {break}
            in 1..archiveList.getSize() -> {archiveList[command - 1]?.showMenu() ?: null}
//            var command2 =  }
            else -> println("неизвестная команда")
        }
    }
}

