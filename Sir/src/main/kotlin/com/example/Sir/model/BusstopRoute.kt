package com.example.Sir.model

import jakarta.persistence.*

@Entity
@Table(name="busstop_route")
class BusstopRoute {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var orden: Int?=null
    @Column(name="busstop_id")
    var busstopId: Int?=null
    @Column(name="route_id")
    var routeId:Int?=null
    var tiempo:Int?=null


}