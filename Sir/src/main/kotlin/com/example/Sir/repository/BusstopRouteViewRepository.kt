package com.example.Sir.repository

import com.example.Sir.model.BusstopRouteView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BusstopRouteViewRepository:JpaRepository<BusstopRouteView,Long?> {


}