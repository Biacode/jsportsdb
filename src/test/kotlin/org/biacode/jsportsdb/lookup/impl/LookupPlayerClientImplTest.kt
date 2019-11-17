package org.biacode.jsportsdb.lookup.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.lookup.LookupPlayerClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 9:10 PM
 */
class LookupPlayerClientImplTest {

    private lateinit var client: LookupPlayerClient

    @Before
    fun before() {
        client = LookupPlayerClientImpl()
    }

    @Test
    fun byId() {
        val resultResponse = client.byId(34145937)
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}