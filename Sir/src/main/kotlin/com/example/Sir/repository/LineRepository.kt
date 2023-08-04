package com.example.Sir.repository

import com.example.Sir.model.Line
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LineRepository:JpaRepository<Line,Long> {
    fun findById(id:Long?):Line?

}