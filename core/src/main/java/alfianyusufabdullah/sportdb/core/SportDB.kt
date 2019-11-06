package alfianyusufabdullah.sportdb.core

object SportDB {
    private var apiKey: String = ""

    fun createInstance(apiKey: String): SportDB {
        this.apiKey = apiKey

        return this
    }

    internal fun getApiKey(): String{
        return if (apiKey.isNotEmpty()){
            apiKey
        } else {
            throw IllegalAccessException("API KEY is not provide!")
        }
    }
}