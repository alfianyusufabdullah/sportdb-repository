package alfianyusufabdullah.sportdb.core.route

import alfianyusufabdullah.sportdb.core.SportDB
import alfianyusufabdullah.sportdb.core.entity.MatchesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface SportDBService {

    @GET("/api/v1/json/{apiKey}/eventspastleague.php")
    suspend fun getLastMatches(
        @Path("apiKey") apiKey: String? = SportDB.getApiKey(),
        @Query("id") id: String
    ): MatchesResponse

    @GET("/api/v1/json/{apiKey}/eventsnextleague.php")
    suspend fun getNextMatches(
        @Path("apiKey") apiKey: String? = SportDB.getApiKey(),
        @Query("id") id: String
    ): MatchesResponse

    @GET("/api/v1/json/{apiKey}/lookupevent.php")
    suspend fun getDetailMatch(
        @Path("apiKey") apiKey: String? = SportDB.getApiKey(),
        @Query("id") id: String
    ): MatchesResponse

}