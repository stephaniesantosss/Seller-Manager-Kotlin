package com.br.sellermanager.service

import com.br.sellermanager.model.dto.SellerIn

interface SellerService {

    fun saveSeller(sellerIn: SellerIn)
}