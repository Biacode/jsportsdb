package org.biacode.jsportsdb

import org.biacode.jsportsdb.search.impl.SearchTeamClientImpl


/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 2:09 PM
 */
object KotlinDemoApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val resultResponse = SearchTeamClientImpl().byShortCode("Arsenal")
        println(resultResponse.asString())
        println(resultResponse.asMap())
    }
}