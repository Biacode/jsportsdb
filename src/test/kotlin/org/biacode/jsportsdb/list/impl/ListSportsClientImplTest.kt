package org.biacode.jsportsdb.list.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.list.ListSportsClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:07 PM
 */
class ListSportsClientImplTest {

    private lateinit var client: ListSportsClient

    @Before
    fun before() {
        client = ListSportsClientImpl()
    }

    @Test
    fun all() {
        val resultResponse = client.all()
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}