package mx.edu.uttt.dsicode.wallet.model

import java.time.LocalDate

data class card(
    val number: Number,
    val expiration: LocalDate,
    val CVV: Number,
    val bank: String,
    val type: String,
    val balance: Number
)
