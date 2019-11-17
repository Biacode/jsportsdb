package org.biacode.jsportsdb.lookup.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.lookup.LookupContractClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 9:10 PM
 */
class LookupContractClientImplTest {

    private lateinit var client: LookupContractClient

    @Before
    fun before() {
        client = LookupContractClientImpl()
    }

    @Test
    fun byId() {
        val resultResponse = client.byId(34147178)
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}