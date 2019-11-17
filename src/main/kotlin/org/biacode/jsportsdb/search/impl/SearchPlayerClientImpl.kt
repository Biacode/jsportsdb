package org.biacode.jsportsdb.search.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.model.ResultResponse
import org.biacode.jsportsdb.search.SearchPlayerClient

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 3:33 PM
 */
class SearchPlayerClientImpl : SearchPlayerClient, AbstractJsportsClient() {
    override fun byName(playerName: String): ResultResponse {
        val request = requestBuilder("/searchplayers.php?p=$playerName")
        return ResultResponse(handleClientCall(request), objectMapper)
    }

    override fun byTeamName(teamName: String): ResultResponse {
        val request = requestBuilder("/searchplayers.php?t=$teamName")
        return ResultResponse(handleClientCall(request), objectMapper)
    }

    override fun byTeamAndName(teamName: String, playerName: String): ResultResponse {
        val request = requestBuilder("/searchplayers.php?t=$teamName&p=$playerName")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}