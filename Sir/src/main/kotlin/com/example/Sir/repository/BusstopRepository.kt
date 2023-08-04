package com.example.Sir.repository

import com.example.Sir.model.Busstop
import com.example.Sir.model.Line

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BusstopRepository:JpaRepository<Busstop, Long> {
    fun findById(id: Long?):Busstop?

}