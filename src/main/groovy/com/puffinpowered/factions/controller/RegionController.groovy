package com.puffinpowered.factions.controller

import com.puffinpowered.factions.domain.Region
import com.puffinpowered.factions.service.RegionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by pshields on 21/03/2017.
 */
@RestController
@RequestMapping("/region")
class RegionController {

    @Autowired
    RegionService regionService

    @GetMapping(value="/{id}")
    public Region oneRegion(@PathVariable(value="id")Long id) {
        return regionService.findOne(id)
    }


}
