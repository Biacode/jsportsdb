package org.biacode.jsportsdb.search

import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 2:50 PM
 */
interface SearchEventClient {
    fun byName(name: String): ResultResponse

    fun byNameAndSeason(name: String, season: Int): ResultResponse
}