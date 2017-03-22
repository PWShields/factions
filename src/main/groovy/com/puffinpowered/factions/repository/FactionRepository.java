package com.puffinpowered.factions.repository;


import com.puffinpowered.factions.domain.Faction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pshields on 13/09/2016.
 */
@Repository
public interface FactionRepository extends CrudRepository<Faction, Long> {
}
