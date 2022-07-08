package info.wallyson.banking.domain.common

import com.fasterxml.jackson.annotation.JsonValue
import java.util.UUID
import java.util.UUID.fromString
import java.util.UUID.randomUUID

data class AggregateId(@JsonValue private val value: UUID = randomUUID()) {

    constructor(value: String) : this(fromString(value))

    fun toUUID(): UUID = value

    override fun toString(): String = value.toString()
}
