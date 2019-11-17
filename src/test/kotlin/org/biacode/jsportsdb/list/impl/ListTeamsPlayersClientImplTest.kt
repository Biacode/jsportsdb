package org.biacode.jsportsdb.list.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.list.ListTeamsPlayersClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:41 PM
 */
class ListTeamsPlayersClientImplTest {

    private lateinit var client: ListTeamsPlayersClient

    @Before
    fun before() {
        client = ListTeamsPlayersClientImpl()
    }

    @Test
    fun byTeamId() {
        val resultResponse = client.byTeamId(133604)
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}