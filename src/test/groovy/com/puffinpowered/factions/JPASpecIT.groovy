package com.puffinpowered.factions

import com.puffinpowered.factions.domain.Region
import com.puffinpowered.factions.repository.RegionRepository
import org.apache.tomcat.jdbc.pool.DataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification
import spock.lang.Stepwise
/**
 * Created by pshields on 21/03/2017.
 */
@ContextConfiguration(classes = [FactionsApplication])
@ActiveProfiles("local")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
@Stepwise
class JPASpecIT extends Specification{

    @Autowired
    DataSource dataSource
    @Autowired
    WebApplicationContext context


    @Autowired
    RegionRepository regionRepository

    def "should boot up without errors"() {
        expect: "web application context exists"
        context != null
    }

    def "we can save a region"() {
        given: "a region"
        Region region = new Region()
        regionRepository.save(region)
        expect: "it can be persisted"
        Set<Region> regions = regionRepository.findAll()
        assert regions.size() == 1
    }

}
