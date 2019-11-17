package org.biacode.jsportsdb.lookup.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.lookup.LookupEventClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 9:10 PM
 */
class LookupEventClientImplTest {

    private lateinit var client: LookupEventClient

    @Before
    fun before() {
        client = LookupEventClientImpl()
    }

    @Test
    fun byId() {
        val resultResponse = client.byId(441613)
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}