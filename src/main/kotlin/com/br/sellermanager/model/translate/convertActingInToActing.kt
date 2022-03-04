package com.br.sellermanager.model.translate

import com.br.sellermanager.model.Acting
import com.br.sellermanager.model.dto.ActingIn

fun convertActingInToActing(actingIn: ActingIn): Acting {
    return Acting(actingIn.region, actingIn.states)
}