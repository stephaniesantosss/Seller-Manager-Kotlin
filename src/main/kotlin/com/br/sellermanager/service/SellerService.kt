package com.br.sellermanager.service

import com.br.sellermanager.model.dto.SellerIn
import com.br.sellermanager.model.dto.SellerOut

interface SellerService {

    fun saveSeller(sellerIn: SellerIn)

    fun searchSeller(id: String): SellerOut
}