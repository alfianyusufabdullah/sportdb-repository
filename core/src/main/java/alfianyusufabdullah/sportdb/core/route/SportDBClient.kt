package alfianyusufabdullah.sportdb.core.route

import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

internal object SportDBClient {

    val client: SportDBService
        get() {
            return Retrofit.Builder()
                .baseUrl("https://www.thesportsdb.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
                .create(SportDBService::class.java)
        }
}