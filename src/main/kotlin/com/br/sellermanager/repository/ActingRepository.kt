package com.br.sellermanager.repository

import com.br.sellermanager.model.Acting
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ActingRepository : MongoRepository<Acting, String> {
}