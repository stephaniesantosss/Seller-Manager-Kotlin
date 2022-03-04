package com.br.sellermanager.core.model.dto

data class SellerOutList(
    val name: String,
    val telephone: String,
    val age: Int,
    val city: String,
    val state: String,
    val states: List<String>
) {
}