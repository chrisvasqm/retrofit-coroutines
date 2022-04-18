package data

import data.model.Book
import network.BookAPI
import retrofit2.Response

class BookRepository(private val api: BookAPI) : Repository<Book> {

    override suspend fun all(): Response<List<Book>> = api.all()

    override suspend fun find(id: Int): Response<Book> = api.find(id)

}