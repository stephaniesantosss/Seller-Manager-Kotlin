package com.br.sellermanager.service.impl

import com.br.sellermanager.model.dto.SellerIn
import com.br.sellermanager.repository.SellerRepository
import com.br.sellermanager.convertSellerInToSeller
import com.br.sellermanager.service.SellerService
import org.springframework.stereotype.Service

@Service
class SellerServiceImpl(
    private val sellerRepository: SellerRepository
) : SellerService {

    override fun saveSeller(sellerIn: SellerIn) {
        val response = convertSellerInToSeller(sellerIn)
        sellerRepository.save(response)
    }
}