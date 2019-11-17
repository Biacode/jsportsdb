package org.biacode.jsportsdb.list.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.list.ListTeamsDetailsClient
import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:06 PM
 */
class ListTeamsDetailsClientImpl : ListTeamsDetailsClient, AbstractJsportsClient() {
    override fun byLeague(id: Int): ResultResponse {
        val request = requestBuilder("/lookup_all_teams.php?id=$id")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}