package org.biacode.jsportsdb.search.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.model.ResultResponse
import org.biacode.jsportsdb.search.SearchTeamClient

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 3:00 PM
 */
class SearchTeamClientImpl : SearchTeamClient, AbstractJsportsClient() {
    override fun byName(name: String): ResultResponse {
        val request = requestBuilder("/searchteams.php?t=$name")
        return ResultResponse(handleClientCall(request), objectMapper)
    }

    override fun byShortCode(shortCode: String): ResultResponse {
        val request = requestBuilder("/searchteams.php?sname=$shortCode")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}