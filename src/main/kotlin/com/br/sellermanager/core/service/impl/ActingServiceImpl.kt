package com.br.sellermanager.core.service.impl

import com.br.sellermanager.core.model.dto.ActingIn
import com.br.sellermanager.core.translate.convertActingInToActing
import com.br.sellermanager.dataprovider.repository.ActingRepository
import com.br.sellermanager.core.service.ActingService
import org.springframework.stereotype.Service

@Service
class ActingServiceImpl(
    private val actingRepository: ActingRepository
) : ActingService {

    override fun saveActing(actingIn: ActingIn) {
        val response = convertActingInToActing(actingIn)

        actingRepository.save(response)
    }
}