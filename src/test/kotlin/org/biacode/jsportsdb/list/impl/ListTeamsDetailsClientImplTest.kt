package org.biacode.jsportsdb.list.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.list.ListTeamsDetailsClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:40 PM
 */
class ListTeamsDetailsClientImplTest {

    private lateinit var client: ListTeamsDetailsClient

    @Before
    fun before() {
        client = ListTeamsDetailsClientImpl()
    }

    @Test
    fun byLeague() {
        val resultResponse = client.byLeague(4328)
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}