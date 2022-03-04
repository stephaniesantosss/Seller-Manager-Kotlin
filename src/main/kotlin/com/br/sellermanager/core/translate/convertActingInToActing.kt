package com.br.sellermanager.core.translate

import com.br.sellermanager.core.model.Acting
import com.br.sellermanager.core.model.dto.ActingIn

fun convertActingInToActing(actingIn: ActingIn): Acting {
    return Acting(actingIn.region, actingIn.states)
}