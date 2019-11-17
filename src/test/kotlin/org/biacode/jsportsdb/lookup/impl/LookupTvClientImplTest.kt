package org.biacode.jsportsdb.lookup.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.lookup.LookupTvClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 9:10 PM
 */
class LookupTvClientImplTest {

    private lateinit var client: LookupTvClient

    @Before
    fun before() {
        client = LookupTvClientImpl()
    }

    @Test
    fun byId() {
        val resultResponse = client.byId(584911)
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}