package com.br.sellermanager.repository

import com.br.sellermanager.model.Seller
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SellerRepository : MongoRepository<Seller, String> {
}