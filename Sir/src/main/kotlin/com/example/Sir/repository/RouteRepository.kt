package com.example.Sir.repository

import com.example.Sir.model.Route
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RouteRepository:JpaRepository<Route, Long> {
    fun findById(id: Long?):Route?

}