package org.biacode.jsportsdb.search.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.search.SearchTeamClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 3:28 PM
 */
class SearchTeamClientImplTest {

    private lateinit var client: SearchTeamClient

    @Before
    fun before() {
        client = SearchTeamClientImpl()
    }

    @Test
    fun byName() {
        val resultResponse = client.byName("Arsenal")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }

    @Test
    fun byShortCode() {
        val resultResponse = client.byShortCode("Ars")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}