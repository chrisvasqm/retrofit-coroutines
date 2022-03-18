import data.BookRepository
import network.BookAPI
import network.BookService
import network.RetrofitClientProvider

fun main() {
    val client = RetrofitClientProvider.provide()
    val service = BookService(BookRepository(client.create(BookAPI::class.java)))

    val book = service.find(1)
    println(book)

    val books = service.fetch()
    books.forEach { println(it) }
}