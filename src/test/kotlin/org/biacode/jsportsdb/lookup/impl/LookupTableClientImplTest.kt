package org.biacode.jsportsdb.lookup.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.lookup.LookupTableClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 9:10 PM
 */
class LookupTableClientImplTest {

    private lateinit var client: LookupTableClient

    @Before
    fun before() {
        client = LookupTableClientImpl()
    }

    @Test
    fun byLeagueAndSeason() {
        val resultResponse = client.byLeagueAndSeason(4328, 1819)
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}