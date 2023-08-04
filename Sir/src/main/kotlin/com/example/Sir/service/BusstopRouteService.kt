package com.example.Sir.service

import com.example.Sir.model.Busstop
import com.example.Sir.model.BusstopRoute
import com.example.Sir.model.BusstopRouteView
import com.example.Sir.repository.BusstopRepository
import com.example.Sir.repository.BusstopRouteRepository
import com.example.Sir.repository.BusstopRouteViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class BusstopRouteService {
    @Autowired
    lateinit var busstopRouteRepository: BusstopRouteRepository
    @Autowired
    lateinit var busstopRouteViewRepository: BusstopRouteViewRepository

    fun listBusstopView():List<BusstopRouteView>{
        return busstopRouteViewRepository.findAll()
    }
    fun list(): List<BusstopRoute> {
        return busstopRouteRepository.findAll() //llama al metodo del metodo del repositorio y llama a cada uno de los metodos
    }

    fun save(busstopRoute: BusstopRoute): BusstopRoute {
        try {
            return busstopRouteRepository.save(busstopRoute)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun update(busstopRoute: BusstopRoute): BusstopRoute {
        try {
            busstopRouteRepository.findById(busstopRoute.id)
                    ?: throw Exception("ID no existe")

            return busstopRouteRepository.save(busstopRoute)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun updateOrden(busstopRoute: BusstopRoute): BusstopRoute {
        try {
            val response = busstopRouteRepository.findById(busstopRoute.id)
                    ?: throw Exception("ID no existe")
            response.apply {
                orden = busstopRoute.orden
            }
            return busstopRouteRepository.save(response)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }


    }
}