package com.example.Sir.model

import jakarta.persistence.*

@Entity
@Table(name="busstop")
class Busstop {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)

    var id: Long? =null
    var name: String?=null


}