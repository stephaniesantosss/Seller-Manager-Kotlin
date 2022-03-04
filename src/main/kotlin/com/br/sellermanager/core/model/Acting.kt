package com.br.sellermanager.core.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "acting")
class Acting(
    @Id val region: String,
    val states: List<String>
) {

}
