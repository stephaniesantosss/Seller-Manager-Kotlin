package com.br.sellermanager.service.impl

import com.br.sellermanager.convertSellerInToSeller
import com.br.sellermanager.model.dto.SellerIn
import com.br.sellermanager.model.dto.SellerOut
import com.br.sellermanager.repository.ActingRepository
import com.br.sellermanager.repository.SellerRepository
import com.br.sellermanager.service.SellerService
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class SellerServiceImpl(
    private val sellerRepository: SellerRepository,
    private val actingRepository: ActingRepository
) : SellerService {

    override fun saveSeller(sellerIn: SellerIn) {
        val response = convertSellerInToSeller(sellerIn)
        sellerRepository.save(response)
    }

    override fun searchSeller(id: String): SellerOut {

        return sellerRepository.findById(id).map { seller ->
            val acting = actingRepository.findById(seller.region)

            SellerOut(
                name = seller.name,
                dateInclusion = seller.dateInclusion,
                states = acting.get().states
            )
        }.orElseThrow { ResponseStatusException(HttpStatus.NO_CONTENT) }
    }
}