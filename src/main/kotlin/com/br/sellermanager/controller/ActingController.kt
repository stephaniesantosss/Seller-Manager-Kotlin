package com.br.sellermanager.controller

import com.br.sellermanager.controller.api.ActingControllerApi
import com.br.sellermanager.model.dto.ActingIn
import com.br.sellermanager.service.ActingService
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class ActingController(private val actingService: ActingService) : ActingControllerApi {

    override fun saveActing(actingIn: ActingIn): ResponseEntity<Any> {
        actingService.saveActing(actingIn)

        return ResponseEntity(CREATED)
    }
}