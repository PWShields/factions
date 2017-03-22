package com.puffinpowered.factions.service

import com.puffinpowered.factions.domain.Region
import com.puffinpowered.factions.repository.RegionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by pshields on 21/03/2017.
 */
@Service
class RegionServiceImpl implements RegionService{

    @Autowired
    private RegionRepository regionRepository

    public Region findOne(Long id){
       return regionRepository.findOne(id)
    }


    Set<Region> findAll() {
        return regionRepository.findAll()
    }
}
