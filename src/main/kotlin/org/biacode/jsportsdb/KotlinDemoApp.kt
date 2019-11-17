package org.biacode.jsportsdb

import org.biacode.jsportsdb.list.impl.ListSportsClientImpl
import org.biacode.jsportsdb.search.impl.SearchTeamClientImpl


/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 2:09 PM
 */
object KotlinDemoApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val searchTeamResult = SearchTeamClientImpl().byShortCode("Arsenal")
        println(searchTeamResult.asString())
        println(searchTeamResult.asMap())

        val listSportsResult = ListSportsClientImpl().all()
        println(listSportsResult.asString())
        println(listSportsResult.asMap())
    }
}