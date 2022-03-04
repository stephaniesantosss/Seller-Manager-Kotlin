package com.br.sellermanager.service

import com.br.sellermanager.model.dto.ActingIn

interface ActingService {

    fun saveActing(actingIn: ActingIn)
}