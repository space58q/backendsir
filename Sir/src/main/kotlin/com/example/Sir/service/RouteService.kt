package com.example.Sir.service

import com.example.Sir.model.Busstop
import com.example.Sir.model.Route
import com.example.Sir.repository.BusstopRepository
import com.example.Sir.repository.RouteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class RouteService {
    @Autowired
    lateinit var routeRepository: RouteRepository

    fun list (): List<Route> {
        return routeRepository.findAll() //llama al metodo del metodo del repositorio y llama a cada uno de los metodos
    }

    fun save (route: Route): Route {
        try {
            return routeRepository.save(route)
        } catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun update(route: Route): Route {
        try {
            routeRepository.findById(route.id)
                    ?: throw Exception("ID no existe")

            return routeRepository.save(route)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun updateName(route: Route): Route {
        try{
            val response = routeRepository.findById(route.id)
                    ?: throw Exception("ID no existe")
            response.apply {
                name=route.name
            }
            return routeRepository.save(response)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}