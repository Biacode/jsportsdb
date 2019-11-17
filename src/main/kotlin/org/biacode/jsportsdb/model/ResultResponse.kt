package org.biacode.jsportsdb.model

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper


/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 3:01 PM
 */
data class ResultResponse(private val stringBody: String, private val objectMapper: ObjectMapper) {
    fun asString(): String = stringBody
    fun asMap(): Map<String, Any> = objectMapper.readValue(stringBody, object : TypeReference<Map<String, Any>>() {})
}