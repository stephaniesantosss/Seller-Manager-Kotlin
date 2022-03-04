package com.br.sellermanager.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.util.*

@Document(collection = "vendedor")
class Vendedor (
    @Id val id: String,
    val nome: String,
    val telefone: String,
    val idade: Int,
    val cidade: String,
    val estado: String,
    val regiao: String,
    val dataInclusao: LocalDate
) {
}