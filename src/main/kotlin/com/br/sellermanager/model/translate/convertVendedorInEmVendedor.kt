package com.br.sellermanager

import com.br.sellermanager.model.Vendedor
import com.br.sellermanager.model.dto.VendedorIn
import java.time.LocalDate
import java.util.*

fun convertVendedorInEmVendedor(vendedorIn: VendedorIn): Vendedor {
    return Vendedor(
        id = UUID.randomUUID().toString(),
        nome = vendedorIn.nome,
        telefone = vendedorIn.telefone,
        idade = vendedorIn.idade,
        cidade = vendedorIn.cidade,
        estado = vendedorIn.estado,
        regiao = vendedorIn.regiao,
        dataInclusao = LocalDate.now()
    )
}