package com.br.sellermanager.service.impl

import com.br.sellermanager.model.dto.ActingIn
import com.br.sellermanager.model.translate.convertActingInToActing
import com.br.sellermanager.repository.ActingRepository
import com.br.sellermanager.service.ActingService
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