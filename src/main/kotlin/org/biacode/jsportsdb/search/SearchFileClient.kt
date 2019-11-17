package org.biacode.jsportsdb.search

import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 2:51 PM
 */
interface SearchFileClient {
    fun byEventName(fileName: String): ResultResponse
}