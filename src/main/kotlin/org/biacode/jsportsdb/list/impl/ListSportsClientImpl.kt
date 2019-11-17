package org.biacode.jsportsdb.list.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.list.ListSportsClient
import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:06 PM
 */
class ListSportsClientImpl : ListSportsClient, AbstractJsportsClient() {
    override fun all(): ResultResponse {
        val request = requestBuilder("/all_sports.php")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}