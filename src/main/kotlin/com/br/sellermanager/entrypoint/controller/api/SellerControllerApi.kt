package com.br.sellermanager.entrypoint.controller.api

import com.br.sellermanager.core.model.dto.SellerIn
import com.br.sellermanager.core.model.dto.SellerOut
import com.br.sellermanager.core.model.dto.SellerOutList
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/seller")
interface SellerControllerApi {

    @ResponseStatus(CREATED)
    @PostMapping
    fun saveSeller(@RequestBody sellerIn: SellerIn): ResponseEntity<Any>

    @ResponseStatus(OK)
    @GetMapping("/{id}")
    fun searchSeller(@PathVariable id: String): SellerOut

    @ResponseStatus(OK)
    @GetMapping
    fun searchSellers(): List<SellerOutList>

}