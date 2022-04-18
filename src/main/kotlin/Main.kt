import data.BookRepository
import network.BookAPI
import network.BookService
import network.RetrofitClientProvider

fun main() {
    val client = RetrofitClientProvider.instance
    val api = client.create(BookAPI::class.java)
    val repository = BookRepository(api)
    val service = BookService(repository)
    val id = -1

    println("Looking for Book by id: $id")
    try {
        println(service.find(id))
    } catch (e: Exception) {
        println("Could not find Book with id: $id")
    }

    println("Fetching all books: ")
    try {
        service.fetch()?.forEach { println(it) }
    } catch (e: Exception) {
        println("Something went wrong. Please check your internet access.")
    }
}