package com.br.sellermanager.core.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "seller")
class Seller (
    @Id val id: String,
    val name: String,
    val telephone: String,
    val age: Int,
    val city: String,
    val state: String,
    val region: String,
    val dateInclusion: LocalDate
) {
}