package org.biacode.jsportsdb.search

import org.biacode.jsportsdb.model.ResultResponse

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 2:45 PM
 */
interface SearchPlayerClient {
    fun byName(playerName: String): ResultResponse

    fun byTeamName(teamName: String): ResultResponse

    fun byTeamAndName(teamName: String, playerName: String): ResultResponse
}