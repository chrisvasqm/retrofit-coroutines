import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.runBlocking
import network.BookAPI
import network.RetrofitClientProvider
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import retrofit2.Retrofit

class BookServiceTests {

    private lateinit var client: Retrofit
    private lateinit var api: BookAPI

    @BeforeMethod
    fun setUp() {
        client = RetrofitClientProvider.provide()
        api = client.create(BookAPI::class.java)
    }

    @Test
    fun `Fetch all books`() = runBlocking {
        val books = api.all()
        assertThat(books).isNotEmpty()
    }

    @Test
    fun `Find Book by ID`() = runBlocking {
        val book = api.find(1)
        assertThat(book).isNotNull()
        assertThat(book.id).isEqualTo(1)
    }
}