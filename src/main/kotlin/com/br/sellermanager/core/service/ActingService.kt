package com.br.sellermanager.core.service

import com.br.sellermanager.core.model.dto.ActingIn

interface ActingService {

    fun saveActing(actingIn: ActingIn)
}