package com.br.sellermanager.repository

import com.br.sellermanager.model.Vendedor
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface VendedorRepository : MongoRepository<Vendedor, String> {
}