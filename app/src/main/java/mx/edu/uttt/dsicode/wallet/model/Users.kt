package mx.edu.uttt.dsicode.wallet.model

import java.time.LocalDate
import java.util.UUID
import mx.edu.uttt.dsicode.wallet.model.card
data class Users(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val address: String,
    val curp: String,
    val birthday: LocalDate,
    val electorKey: String,
    var cards: MutableList<card> = mutableListOf()
)
