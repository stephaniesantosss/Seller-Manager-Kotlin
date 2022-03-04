package com.br.sellermanager.model.dto

data class SellerOutList(
    val name: String,
    val telephone: String,
    val age: Int,
    val city: String,
    val state: String,
    val states: List<String>
) {
}