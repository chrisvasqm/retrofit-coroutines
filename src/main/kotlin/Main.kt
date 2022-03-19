import data.BookRepository
import network.BookAPI
import network.BookService
import network.RetrofitClientProvider

fun main() {
    val client = RetrofitClientProvider.instance
    val api = client.create(BookAPI::class.java)
    val repository = BookRepository(api)
    val service = BookService(repository)

    val book = service.find(1)
    println(book)

    val books = service.fetch()
    books.forEach { println(it) }
}