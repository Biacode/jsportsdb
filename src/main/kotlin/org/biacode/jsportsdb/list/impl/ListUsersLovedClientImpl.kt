package org.biacode.jsportsdb.list.impl

import org.biacode.jsportsdb.AbstractJsportsClient
import org.biacode.jsportsdb.list.ListUsersLovedClient
import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:06 PM
 */
class ListUsersLovedClientImpl : ListUsersLovedClient, AbstractJsportsClient() {
    override fun byUser(user: String): ResultResponse {
        val request = requestBuilder("/searchloves.php?u=$user")
        return ResultResponse(handleClientCall(request), objectMapper)
    }
}