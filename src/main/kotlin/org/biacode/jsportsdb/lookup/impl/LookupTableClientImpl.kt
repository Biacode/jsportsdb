package org.biacode.jsportsdb.lookup.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.lookup.LookupTableClient
import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 8:56 PM
 */
class LookupTableClientImpl : LookupTableClient, AbstractJsportsClient() {
    override fun byLeagueAndSeason(leagueId: Int, seasonId: Int): ResultResponse {
        val request = requestBuilder("/lookuptable.php?l=$leagueId&s=$seasonId")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}