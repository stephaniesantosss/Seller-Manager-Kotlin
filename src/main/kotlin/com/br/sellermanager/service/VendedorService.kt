package com.br.sellermanager.service

import com.br.sellermanager.model.dto.VendedorIn

interface VendedorService {

    fun salvaVendedor(vendedorIn: VendedorIn)
}