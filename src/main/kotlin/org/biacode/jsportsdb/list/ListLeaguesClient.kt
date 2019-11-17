package org.biacode.jsportsdb.list

import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:06 PM
 */
interface ListLeaguesClient {
    fun all(): ResultResponse

    fun byCountry(country: String): ResultResponse

    fun byCountryAndSport(country: String, sport: String): ResultResponse
}