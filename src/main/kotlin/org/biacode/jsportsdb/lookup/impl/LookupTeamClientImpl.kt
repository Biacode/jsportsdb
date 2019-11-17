package org.biacode.jsportsdb.lookup.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.lookup.LookupTeamClient
import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 8:56 PM
 */
class LookupTeamClientImpl : LookupTeamClient, AbstractJsportsClient() {
    override fun byId(id: Int): ResultResponse {
        val request = requestBuilder("/lookupteam.php?id=$id")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}