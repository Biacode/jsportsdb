package org.biacode.jsportsdb

import com.fasterxml.jackson.databind.ObjectMapper
import okhttp3.OkHttpClient
import okhttp3.Request

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 3:20 PM
 */
abstract class AbstractJsportsClient(
        var client: OkHttpClient = OkHttpClient(),
        var objectMapper: ObjectMapper = ObjectMapper(),
        var apiKey: String = "1"
) {
    protected fun handleClientCall(request: Request): String {
        return client.newCall(request).execute().use { response ->
            response.body!!.string()
        }
    }

    protected fun requestBuilder(uri: String): Request {
        return Request.Builder()
                .url("${urlString()}$uri")
                .build()
    }

    private fun urlString(): String = "https://www.thesportsdb.com/api/v1/json/$apiKey"
}