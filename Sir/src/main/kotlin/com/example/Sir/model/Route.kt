package com.example.Sir.model

import jakarta.persistence.*

@Entity
@Table(name="route")
class Route {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var name:String?=null
    var direction:String?=null
    @Column(name="line_id")
    var lineId: Int?=null
    @Column(name="cant_busstop")
    var cantBusstop:Int?=null




}