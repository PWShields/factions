package com.puffinpowered.factions.controller

import com.puffinpowered.factions.domain.Faction
import com.puffinpowered.factions.service.FactionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
/**
 * Created by pshields on 21/03/2017.
 */
@RestController
@RequestMapping("/faction")
class FactionController {

    @Autowired
    FactionService factionService

    @GetMapping(value="/{id}")
    public Faction oneFaction(@PathVariable(value="id")Long id) {
        return factionService.findOne(id)
    }
    @GetMapping(value="/list")
    public Set<Faction> allFactions() {
        return factionService.findAll()
    }


}
