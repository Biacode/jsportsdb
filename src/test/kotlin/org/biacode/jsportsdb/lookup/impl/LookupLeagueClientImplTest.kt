package org.biacode.jsportsdb.lookup.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.lookup.LookupLeagueClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 9:10 PM
 */
class LookupLeagueClientImplTest {

    private lateinit var client: LookupLeagueClient

    @Before
    fun before() {
        client = LookupLeagueClientImpl()
    }

    @Test
    fun byId() {
        val resultResponse = client.byId(4346)
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}