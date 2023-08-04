package com.example.Sir.controller

import com.example.Sir.model.Busstop
import com.example.Sir.model.BusstopRoute
import com.example.Sir.model.BusstopRouteView
import com.example.Sir.model.Line
import com.example.Sir.service.BusstopRouteService
import com.example.Sir.service.LineService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/busstopRoute")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class BusstopRouteController {
    @Autowired
    lateinit var busstopRouteService: BusstopRouteService

    @GetMapping

    fun list(): ResponseEntity<*> {
        return ResponseEntity(busstopRouteService.list(), HttpStatus.OK)
    }
    @GetMapping("/busstopView")
    fun listBusstopView(): List<BusstopRouteView> {
        return  busstopRouteService.listBusstopView()
    }

    @PostMapping


    fun save (@RequestBody busstopRoute: BusstopRoute): ResponseEntity<BusstopRoute> {
        return ResponseEntity(busstopRouteService.save(busstopRoute), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody busstopRoute: BusstopRoute): ResponseEntity<BusstopRoute> {
        return ResponseEntity(busstopRouteService.update(busstopRoute), HttpStatus.OK)
    }

    @PatchMapping
    fun updateOrden (@RequestBody busstopRoute: BusstopRoute): ResponseEntity<BusstopRoute> {
        return ResponseEntity(busstopRouteService.updateOrden(busstopRoute), HttpStatus.OK)
    }

}