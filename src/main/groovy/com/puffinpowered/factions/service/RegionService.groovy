package com.puffinpowered.factions.service

import com.puffinpowered.factions.domain.Region

/**
 * Created by pshields on 21/03/2017.
 */
interface RegionService {

    Region findOne(Long id)

}