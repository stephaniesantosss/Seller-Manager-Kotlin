package com.br.sellermanager.entrypoint.controller.api

import com.br.sellermanager.core.model.dto.ActingIn
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus

interface ActingControllerApi {

    @ResponseStatus(CREATED)
    @PostMapping("/acting")
    fun saveActing(@RequestBody actingIn: ActingIn): ResponseEntity<Any>
}