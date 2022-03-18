package network

import data.Repository
import data.model.Book
import kotlinx.coroutines.runBlocking

class BookService(private val repository: Repository<Book>) {

    fun fetch() = runBlocking { repository.all() }

    fun find(id: Int) = runBlocking { repository.find(id) }

}