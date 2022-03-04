package com.br.sellermanager.model.dto

import java.time.LocalDate

data class SellerOut(
    val name: String,
    val dateInclusion: LocalDate,
    val states: List<String>
) {

}
