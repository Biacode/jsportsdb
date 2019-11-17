package org.biacode.jsportsdb.lookup.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.lookup.LookupTvClient
import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 8:56 PM
 */
class LookupTvClientImpl : LookupTvClient, AbstractJsportsClient() {
    override fun byId(id: Int): ResultResponse {
        val request = requestBuilder("/lookuptv.php?id=$id")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}