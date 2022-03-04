package com.br.sellermanager.controller

import com.br.sellermanager.controller.api.VendedorControllerApi
import com.br.sellermanager.model.dto.VendedorIn
import com.br.sellermanager.service.VendedorService
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class VendedorController(private val vendedorService: VendedorService) : VendedorControllerApi {

    override fun salvaVendedor(vendedorIn: VendedorIn): ResponseEntity<Any> {
        vendedorService.salvaVendedor(vendedorIn)

        return ResponseEntity(CREATED)
    }

}