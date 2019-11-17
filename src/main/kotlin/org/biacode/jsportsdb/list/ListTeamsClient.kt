package org.biacode.jsportsdb.list

import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:06 PM
 */
interface ListTeamsClient {
    fun byLeague(league: String): ResultResponse

    fun bySportAndCountry(sport: String, country: String): ResultResponse
}