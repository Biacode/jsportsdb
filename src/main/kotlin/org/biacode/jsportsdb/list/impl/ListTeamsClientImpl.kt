package org.biacode.jsportsdb.list.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.list.ListTeamsClient
import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:06 PM
 */
class ListTeamsClientImpl : ListTeamsClient, AbstractJsportsClient() {
    override fun byLeague(league: String): ResultResponse {
        val request = requestBuilder("/search_all_teams.php?l=$league")
        return ResultResponse(handleClientCall(request), objectMapper)
    }

    override fun bySportAndCountry(sport: String, country: String): ResultResponse {
        val request = requestBuilder("/search_all_teams.php?s=$sport&c=$country")
        return ResultResponse(handleClientCall(request), objectMapper)
    }

}