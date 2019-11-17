package org.biacode.jsportsdb.lookup

import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 8:55 PM
 */
interface LookupHonorClient {
    fun byId(id: Int): ResultResponse
}