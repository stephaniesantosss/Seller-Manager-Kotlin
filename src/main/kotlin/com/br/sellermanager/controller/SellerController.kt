package com.br.sellermanager.controller

import com.br.sellermanager.controller.api.SellerControllerApi
import com.br.sellermanager.model.dto.SellerIn
import com.br.sellermanager.service.SellerService
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class SellerController(private val sellerService: SellerService) : SellerControllerApi {

    override fun saveSeller(sellerIn: SellerIn): ResponseEntity<Any> {
        sellerService.saveSeller(sellerIn)

        return ResponseEntity(CREATED)
    }

}