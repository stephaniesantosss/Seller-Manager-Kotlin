package com.br.sellermanager.controller.api

import com.br.sellermanager.model.dto.SellerIn
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus

interface SellerControllerApi {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/seller")
    fun saveSeller(@RequestBody sellerIn: SellerIn): ResponseEntity<Any>

}