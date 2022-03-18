package data

interface Repository<E> {
    suspend fun all(): List<E>
    suspend fun find(id: Int): E
}