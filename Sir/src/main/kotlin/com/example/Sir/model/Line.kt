package com.example.Sir.model

import jakarta.persistence.*

@Entity
@Table(name="line")
class Line {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var number:Int?=null

}