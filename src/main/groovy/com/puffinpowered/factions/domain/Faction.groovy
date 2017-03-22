package com.puffinpowered.factions.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany
/**
 * Created by pshields on 21/03/2017.
 */
@Entity
class Faction {

    @Id
    @GeneratedValue
    Long id

    String name

    String emblem


    @OneToMany
    Set<Region> regions



}
