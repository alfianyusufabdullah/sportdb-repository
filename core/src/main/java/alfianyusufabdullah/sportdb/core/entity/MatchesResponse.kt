package alfianyusufabdullah.sportdb.core.entity

import com.fasterxml.jackson.annotation.JsonProperty

data class MatchesResponse(

	@field:JsonProperty("events")
	val events: List<Match>? = null
)