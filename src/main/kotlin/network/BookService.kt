package network

import kotlinx.coroutines.runBlocking

class BookService(private val api: BookAPI) {

    fun fetch() = runBlocking {
        api.all()
    }

    fun find(id: Int) = runBlocking {
        api.find(id)
    }

}