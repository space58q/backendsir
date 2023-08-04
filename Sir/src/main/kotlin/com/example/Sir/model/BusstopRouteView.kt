package com.example.Sir.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
@Table(name="busstop_route_view")
class BusstopRouteView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @NotBlank
    var orden: Int?=null
    @Column(name="busstop_id")
    var busstopId: Int?=null
    @Column(name="route_id")
    var routeId:Int?=null
    var tiempo:Int?=null
    var namebusstop:String?=null

}