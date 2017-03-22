package com.puffinpowered.factions.service

import com.puffinpowered.factions.domain.Faction
/**
 * Created by pshields on 21/03/2017.
 */
interface FactionService {

    Faction findOne(Long id)

    Set<Faction> findAll()

}