package network

import data.Repository
import data.model.Book
import kotlinx.coroutines.runBlocking

class BookService(private val repository: Repository<Book>) {

    fun fetch() = runBlocking {
        val response = repository.all()

        if (response.isSuccessful)
            return@runBlocking response.body()
        else
            throw Exception("Network error")
    }

    fun find(id: Int): Book? = runBlocking {
        val response = repository.find(id)

        if (response.isSuccessful)
            return@runBlocking response.body()
        else
            throw IllegalStateException("Could not find Book with id: $id")
    }

}