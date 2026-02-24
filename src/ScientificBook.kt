class ScientificBook : Book {
    var subject: String = ""

    constructor() : super()
    constructor(s: String) : super() { this.subject = s }

    fun printSubject() = println("Область науки: $subject")

    // Актуальность на основе года издания (year)
    fun calculateRelevance() {
        val age = 2024 - year
        val relevance = if (age > 30) 10 else 100 - (age * 3)
        println("Актуальность данных по теме $subject: $relevance%")
    }

    // Индекс сложности на основе страниц (pages)
    fun getComplexityIndex(pages: Int) {

        val index = pages / 45.0
        println("Индекс сложности материала: ${"%.1f".format(index)} ед.")
    }
}

typealias Thesis = ScientificBook