class EBook : Book {
    var format: String = ""
    constructor() : super()
    constructor(f: String) : super() { this.format = f }
    fun printFormat() = println("Формат файла: $format")
    // Примерный вес файла (pages * коэффициент формата)
    fun calculateFileSize(pages: Int) {
        val coef = if (format.lowercase() == "pdf") 0.8 else 0.3
        val sizeMb = pages * coef / 10.0
        println("Ориентировочный вес файла: ${"%.2f".format(sizeMb)} МБ")
    }
    // Экономия бумаги (pages / листов в дереве)
    fun getEcoContribution(pages: Int) {
        val savedTrees = pages.toDouble() / 10000
        println("Экологический вклад: сохранено ${"%.4f".format(savedTrees)} дерева.")
    }
}

typealias Digital = EBook