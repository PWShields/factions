package com.puffinpowered.factions.domain

import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.*
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

    @JsonIgnore()
    @ManyToOne
    Faction faction



}
