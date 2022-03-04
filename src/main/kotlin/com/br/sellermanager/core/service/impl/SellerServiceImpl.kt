package com.br.sellermanager.core.service.impl

import com.br.sellermanager.core.translate.convertSellerInToSeller
import com.br.sellermanager.core.model.dto.SellerIn
import com.br.sellermanager.core.model.dto.SellerOut
import com.br.sellermanager.core.model.dto.SellerOutList
import com.br.sellermanager.dataprovider.repository.ActingRepository
import com.br.sellermanager.dataprovider.repository.SellerRepository
import com.br.sellermanager.core.service.SellerService
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

    override fun searchSellers(): List<SellerOutList> {
        return sellerRepository.findAll().map { seller ->
            val acting = actingRepository.findById(seller.region)

            SellerOutList(
                name = seller.name,
                telephone = seller.telephone,
                age = seller.age,
                city = seller.city,
                state = seller.state,
                states = acting.get().states
            )
        }.ifEmpty { throw ResponseStatusException(HttpStatus.NO_CONTENT) }
    }
}