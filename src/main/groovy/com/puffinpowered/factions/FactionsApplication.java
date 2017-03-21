package com.puffinpowered.factions;

import com.puffinpowered.factions.domain.Region;
import com.puffinpowered.factions.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.puffinpowered.factions.domain.RegionType.LANDMASS;

@SpringBootApplication
public class FactionsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FactionsApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(RegionRepository regionRepository) {
        return args -> {


            if (!regionRepository.exists(1l)) {

                Region region = new Region();
                region.setName("Badlands");
                region.setType(LANDMASS);
                regionRepository.save(region);
            }
        };
    }

}
