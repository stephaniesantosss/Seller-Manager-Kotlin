package com.br.sellermanager.core.model.dto

import java.time.LocalDate

data class SellerOut(
    val name: String,
    val dateInclusion: LocalDate,
    val states: List<String>
) {

}
