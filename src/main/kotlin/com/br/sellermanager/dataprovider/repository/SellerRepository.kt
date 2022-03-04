package com.br.sellermanager.dataprovider.repository

import com.br.sellermanager.core.model.Seller
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SellerRepository : MongoRepository<Seller, String> {
}