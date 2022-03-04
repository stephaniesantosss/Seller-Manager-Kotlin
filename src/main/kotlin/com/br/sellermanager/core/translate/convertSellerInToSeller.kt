package com.br.sellermanager

import com.br.sellermanager.core.model.Seller
import com.br.sellermanager.core.model.dto.SellerIn
import java.time.LocalDate
import java.util.*

fun convertSellerInToSeller(sellerIn: SellerIn): Seller {
    return Seller(
        id = UUID.randomUUID().toString(),
        name = sellerIn.name,
        telephone = sellerIn.telephone,
        age = sellerIn.age,
        city = sellerIn.city,
        state = sellerIn.state,
        region = sellerIn.region,
        dateInclusion = LocalDate.now()
    )
}