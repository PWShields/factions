package com.puffinpowered.factions;

import com.puffinpowered.factions.domain.Faction;
import com.puffinpowered.factions.domain.Region;
import com.puffinpowered.factions.repository.FactionRepository;
import com.puffinpowered.factions.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.puffinpowered.factions.domain.RegionType.LANDMASS;

@SpringBootApplication
public class FactionsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FactionsApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(RegionRepository regionRepository, FactionRepository factionRepository) {
        return args -> {


            if (!regionRepository.exists(1l)) {
                Faction faction = new Faction();
                faction.setName("House Wintor");
                faction.setEmblem("White Goshawk on Grey Field");
                factionRepository.save(faction);
                Region region = new Region();
                region.setName("Badlands");
                region.setType(LANDMASS);
                region.setFaction(faction);
                regionRepository.save(region);
                faction = factionRepository.findOne(1L);
                Set<Region> regions = new HashSet<Region>(Arrays.asList(region));
                faction.setRegions(regions);
                factionRepository.save(faction);


            }

        };
    }

}
