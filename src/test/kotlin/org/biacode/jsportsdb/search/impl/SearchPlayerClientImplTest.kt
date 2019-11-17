package org.biacode.jsportsdb.search.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.search.SearchPlayerClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 3:52 PM
 */
class SearchPlayerClientImplTest {

    private lateinit var client: SearchPlayerClient

    @Before
    fun before() {
        client = SearchPlayerClientImpl()
    }

    @Test
    fun byName() {
        val resultResponse = client.byName("Danny Welbeck")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }

    @Test
    fun byTeamName() {
        val resultResponse = client.byTeamName("Arsenal")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }

    @Test
    fun byTeamAndName() {
        val resultResponse = client.byTeamAndName("Arsenal", "Hector Bellerin")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}