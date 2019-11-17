package org.biacode.jsportsdb.search

import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 2:43 PM
 */
interface SearchTeamClient {
    fun byName(name: String): ResultResponse

    fun byShortCode(shortCode: String): ResultResponse
}