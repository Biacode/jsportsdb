package org.biacode.jsportsdb.search.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.search.SearchEventClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 3:50 PM
 */
class SearchEventClientImplTest {

    private lateinit var client: SearchEventClient

    @Before
    fun before() {
        client = SearchEventClientImpl()
    }

    @Test
    fun byName() {
        val resultResponse = client.byName("Arsenal_vs_Chelsea")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }

    @Test
    fun byNameAndSeason() {
        val resultResponse = client.byNameAndSeason("Arsenal_vs_Chelsea", 1617)
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}