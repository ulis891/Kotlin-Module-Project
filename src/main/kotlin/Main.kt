import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var archiveList: Archives = Archives()
    var exit_baton = false
    archiveList.showMenu(archiveList.archives)
    var command = archiveList.inputCommand()
    when(command){
        0 -> archiveList.makeElement()
        archiveList.getSize()+1 -> {
            exitProcess(0)
        }
        in 1..archiveList.getSize() -> {archiveList[command - 1]?.showMenu(archiveList[command - 1]!!.notes)}
        else -> println("неизвестная команда")

    }
}

