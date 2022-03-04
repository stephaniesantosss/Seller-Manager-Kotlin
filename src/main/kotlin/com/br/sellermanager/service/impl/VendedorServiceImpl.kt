package com.br.sellermanager.service.impl

import com.br.sellermanager.model.dto.VendedorIn
import com.br.sellermanager.repository.VendedorRepository
import com.br.sellermanager.convertVendedorInEmVendedor
import com.br.sellermanager.service.VendedorService
import org.springframework.stereotype.Service

@Service
class VendedorServiceImpl(
    private val vendedorRepository: VendedorRepository
) : VendedorService {

    override fun salvaVendedor(vendedorIn: VendedorIn) {
        val response = convertVendedorInEmVendedor(vendedorIn)
        vendedorRepository.save(response)
    }
}