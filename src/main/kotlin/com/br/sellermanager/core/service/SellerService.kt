package com.br.sellermanager.core.service

import com.br.sellermanager.core.model.dto.SellerIn
import com.br.sellermanager.core.model.dto.SellerOut
import com.br.sellermanager.core.model.dto.SellerOutList

interface SellerService {

    fun saveSeller(sellerIn: SellerIn)

    fun searchSeller(id: String): SellerOut

    fun searchSellers(): List<SellerOutList>
}