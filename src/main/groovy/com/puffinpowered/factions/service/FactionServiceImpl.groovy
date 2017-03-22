package com.puffinpowered.factions.service

import com.puffinpowered.factions.domain.Faction
import com.puffinpowered.factions.repository.FactionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
/**
 * Created by pshields on 21/03/2017.
 */
@Service
class FactionServiceImpl implements FactionService{

    @Autowired
    private FactionRepository factionRepository

    public Faction findOne(Long id){
       return factionRepository.findOne(id)
    }


    Set<Faction> findAll() {
        return factionRepository.findAll()
    }
}
