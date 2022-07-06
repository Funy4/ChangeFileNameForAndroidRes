import java.io.File
import java.util.*

fun main(args: Array<String>) {
    val filesFolder = File("files")
    if (!filesFolder.exists()) filesFolder.mkdir()

    val files = filesFolder.listFiles().toList()
    files.forEach { file ->
        file.renameTo(File(filesFolder, file.name.lowercase(Locale.getDefault()).replace("-", "_")))
    }
    println(files)
}
