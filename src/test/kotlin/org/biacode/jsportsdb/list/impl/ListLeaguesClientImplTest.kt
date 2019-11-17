package org.biacode.jsportsdb.list.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.list.ListLeaguesClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:16 PM
 */
class ListLeaguesClientImplTest {

    private lateinit var client: ListLeaguesClient

    @Before
    fun before() {
        client = ListLeaguesClientImpl()
    }

    @Test
    fun all() {
        val resultResponse = client.all()
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }

    @Test
    fun byCountry() {
        val resultResponse = client.byCountry("England")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }

    @Test
    fun byCountryAndSport() {
        val resultResponse = client.byCountryAndSport("England", "Soccer")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}