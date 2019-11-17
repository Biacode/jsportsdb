package org.biacode.jsportsdb.lookup.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.lookup.LookupTeamClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 9:10 PM
 */
class LookupTeamClientImplTest {

    private lateinit var client: LookupTeamClient

    @Before
    fun before() {
        client = LookupTeamClientImpl()
    }

    @Test
    fun byId() {
        val resultResponse = client.byId(133604)
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}