package org.biacode.jsportsdb.list.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.list.ListLeaguesClient
import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:06 PM
 */
class ListLeaguesClientImpl : ListLeaguesClient, AbstractJsportsClient() {
    override fun all(): ResultResponse {
        val request = requestBuilder("/all_leagues.php")
        return ResultResponse(handleClientCall(request), objectMapper)
    }

    override fun byCountry(country: String): ResultResponse {
        val request = requestBuilder("/search_all_leagues.php?c=$country")
        return ResultResponse(handleClientCall(request), objectMapper)
    }

    override fun byCountryAndSport(country: String, sport: String): ResultResponse {
        val request = requestBuilder("/search_all_leagues.php?c=$country&s=$sport")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}