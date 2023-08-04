package com.example.Sir.controller


import com.example.Sir.model.Route
import com.example.Sir.service.RouteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/route")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class RouteController {
    @Autowired
    lateinit var routeService: RouteService

    @GetMapping

    fun list(): ResponseEntity<*> {
        return ResponseEntity(routeService.list(), HttpStatus.OK)
    }


    @PostMapping


    fun save (@RequestBody route: Route): ResponseEntity<Route> {
        return ResponseEntity(routeService.save(route), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody route: Route): ResponseEntity<Route> {
        return ResponseEntity(routeService.update(route), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName (@RequestBody route: Route): ResponseEntity<Route> {
        return ResponseEntity(routeService.updateName(route), HttpStatus.OK)
    }

}