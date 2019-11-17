package org.biacode.jsportsdb.list.impl

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jsportsdb.list.ListUsersLovedClient
import org.junit.Before
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 4:43 PM
 */
class ListUsersLovedClientImplTest {

    private lateinit var client: ListUsersLovedClient

    @Before
    fun before() {
        client = ListUsersLovedClientImpl()
    }

    @Test
    fun byUser() {
        val resultResponse = client.byUser("zag")
        assertThat(resultResponse.asMap()).isNotEmpty
        assertThat(resultResponse.asString()).isNotBlank()
    }
}