package com.br.sellermanager.controller.api

import com.br.sellermanager.model.dto.VendedorIn
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus

interface VendedorControllerApi {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/vendedor")
    fun salvaVendedor(@RequestBody vendedorIn: VendedorIn): ResponseEntity<Any>
}