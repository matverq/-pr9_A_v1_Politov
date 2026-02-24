fun main() {
    val novels = Array(3) { Novel() }
    val scienceBooks = Array(3) { Thesis() }
    val ebooks = Array(3) { Digital() }

    println("---Введите данные для 3-х книг---")
    for (i in 0..2) {
        println("Книга #${i + 1}:")
        print("Название: ")
        novels[i].title = readln()
        print("Автор: ")
        novels[i].author = readln()
        print("Год: ")
        novels[i].year = readln().toIntOrNull() ?: 0
        print("Листов: ")
        novels[i].pages = readln().toIntOrNull() ?: 0
    }
    for (i in 0..2) {
        print("Введите тип книги ${i + 1}: ")
        scienceBooks[i].subject = readln()
        print("Введите формат для электронной книги ${i + 1}: ")
        ebooks[i].format = readln()
    }
    println("\nСписок книг:")
    for (i in 0..2) {
        novels[i].printInfo()
        novels[i].getPaperCount()
        println("Характеристика объема: ${novels[i].getThickness()}")
    }
    println("\nТипы книг:")
    for (i in 0..2) {
        scienceBooks[i].printSubject()
        scienceBooks[i].calculateRelevance()
        scienceBooks[i].getComplexityIndex(novels[i].pages)
    }
    println("\nЭлектронный каталог:")
    for (i in 0..2) {
        ebooks[i].printFormat()
        ebooks[i].calculateFileSize(novels[i].pages)
        ebooks[i].getEcoContribution(novels[i].pages)
    }
}