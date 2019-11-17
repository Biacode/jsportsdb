package org.biacode.jsportsdb.list.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.list.ListSeasonsClient
import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:06 PM
 */
class ListSeasonsClientImpl : ListSeasonsClient, AbstractJsportsClient() {
    override fun byLeague(league: Int): ResultResponse {
        val request = requestBuilder("/search_all_seasons.php?id=$league")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}