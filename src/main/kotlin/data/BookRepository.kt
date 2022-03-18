package data

import data.model.Book
import network.BookAPI

class BookRepository(private val api: BookAPI) : Repository<Book> {

    override suspend fun all(): List<Book> = api.all()

    override suspend fun find(id: Int): Book = api.find(id)

}