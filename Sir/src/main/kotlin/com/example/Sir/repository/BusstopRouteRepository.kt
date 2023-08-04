package com.example.Sir.repository

import com.example.Sir.model.BusstopRoute
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BusstopRouteRepository:JpaRepository<BusstopRoute, Long> {
    fun findById(id: Long?):BusstopRoute?


}