package org.biacode.jsportsdb.list.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.list.ListTeamsClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:39 PM
 */
class ListTeamsClientImplTest {

    private lateinit var client: ListTeamsClient

    @Before
    fun before() {
        client = ListTeamsClientImpl()
    }

    @Test
    fun byLeague() {
        val resultResponse = client.byLeague("English Premier League")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }

    @Test
    fun bySportAndCountry() {
        val resultResponse = client.bySportAndCountry("Soccer", "Spain")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}