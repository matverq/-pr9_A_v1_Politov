open class Book {
    var title: String = ""
    var author: String = ""
    var year: Int = 0
    var pages: Int = 0
    // Выводит основную информацию о книге (название, автор, год) в консоль
   open fun printInfo() = println("Книга: $title, Автор: $author ($year г.)")
    // Определяет категорию книги по её объему: если страниц > 300, то "Толстая", иначе "Тонкая"
    fun getThickness(): String = if (pages > 300) "Толстая" else "Тонкая"
    // Просто выводит общее количество листов (страниц), указанное при вводе
    fun getPaperCount() = println("Объем в листах: $pages")
}

typealias Novel = Book