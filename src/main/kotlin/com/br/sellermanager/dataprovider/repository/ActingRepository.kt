package com.br.sellermanager.dataprovider.repository

import com.br.sellermanager.core.model.Acting
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ActingRepository : MongoRepository<Acting, String> {
}