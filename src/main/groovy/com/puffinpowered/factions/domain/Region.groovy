package com.puffinpowered.factions.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
/**
 * Created by pshields on 21/03/2017.
 */
@Entity
@Table(name = "REGION", schema = "FACTIONS")
class Region {

    @Id
    @GeneratedValue
    Long id

    String name

    RegionType type


}
