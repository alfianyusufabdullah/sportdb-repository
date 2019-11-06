package alfianyusufabdullah.sportdb.core.entity

import com.fasterxml.jackson.annotation.JsonProperty

data class Match(

	@field:JsonProperty("idAwayTeam")
	val idAwayTeam: String? = null,

	@field:JsonProperty("strAwayRedCards")
	val strAwayRedCards: String? = null,

	@field:JsonProperty("intHomeShots")
	val intHomeShots: Any? = null,

	@field:JsonProperty("strHomeLineupDefense")
	val strHomeLineupDefense: String? = null,

	@field:JsonProperty("dateEventLocal")
	val dateEventLocal: String? = null,

	@field:JsonProperty("strAwayLineupSubstitutes")
	val strAwayLineupSubstitutes: String? = null,

	@field:JsonProperty("intAwayShots")
	val intAwayShots: Any? = null,

	@field:JsonProperty("strTime")
	val strTime: String? = null,

	@field:JsonProperty("strAwayGoalDetails")
	val strAwayGoalDetails: String? = null,

	@field:JsonProperty("strAwayLineupForward")
	val strAwayLineupForward: String? = null,

	@field:JsonProperty("strTimeLocal")
	val strTimeLocal: String? = null,

	@field:JsonProperty("strHomeLineupForward")
	val strHomeLineupForward: String? = null,

	@field:JsonProperty("intSpectators")
	val intSpectators: Any? = null,

	@field:JsonProperty("strTVStation")
	val strTVStation: Any? = null,

	@field:JsonProperty("strHomeRedCards")
	val strHomeRedCards: String? = null,

	@field:JsonProperty("strHomeLineupGoalkeeper")
	val strHomeLineupGoalkeeper: String? = null,

	@field:JsonProperty("strHomeGoalDetails")
	val strHomeGoalDetails: String? = null,

	@field:JsonProperty("strAwayLineupGoalkeeper")
	val strAwayLineupGoalkeeper: String? = null,

	@field:JsonProperty("strHomeLineupSubstitutes")
	val strHomeLineupSubstitutes: String? = null,

	@field:JsonProperty("strAwayLineupMidfield")
	val strAwayLineupMidfield: String? = null,

	@field:JsonProperty("idEvent")
	val idEvent: String? = null,

	@field:JsonProperty("strAwayFormation")
	val strAwayFormation: Any? = null,

	@field:JsonProperty("intRound")
	val intRound: String? = null,

	@field:JsonProperty("strHomeYellowCards")
	val strHomeYellowCards: String? = null,

	@field:JsonProperty("strAwayYellowCards")
	val strAwayYellowCards: String? = null,

	@field:JsonProperty("strAwayLineupDefense")
	val strAwayLineupDefense: String? = null,

	@field:JsonProperty("idHomeTeam")
	val idHomeTeam: String? = null,

	@field:JsonProperty("intHomeScore")
	val intHomeScore: String? = null,

	@field:JsonProperty("strHomeTeam")
	val strHomeTeam: String? = null,

	@field:JsonProperty("dateEvent")
	val dateEvent: String? = null,

	@field:JsonProperty("strLeague")
	val strLeague: String? = null,

	@field:JsonProperty("strAwayTeam")
	val strAwayTeam: String? = null,

	@field:JsonProperty("intAwayScore")
	val intAwayScore: String? = null,

	@field:JsonProperty("strHomeLineupMidfield")
	val strHomeLineupMidfield: String? = null,

	@field:JsonProperty("strDate")
	val strDate: String? = null,

	@field:JsonProperty("strHomeFormation")
	val strHomeFormation: Any? = null
)