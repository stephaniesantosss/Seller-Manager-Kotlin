package com.br.sellermanager.controller.api

import com.br.sellermanager.model.dto.SellerIn
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus

interface SellerControllerApi {

    @ResponseStatus(CREATED)
    @PostMapping("/seller")
    fun saveSeller(@RequestBody sellerIn: SellerIn): ResponseEntity<Any>

}