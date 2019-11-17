package org.biacode.jsportsdb.list.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.list.ListTeamsPlayersClient
import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:06 PM
 */
class ListTeamsPlayersClientImpl : ListTeamsPlayersClient, AbstractJsportsClient() {
    override fun byTeamId(id: Int): ResultResponse {
        val request = requestBuilder("/lookup_all_players.php?id=$id")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}