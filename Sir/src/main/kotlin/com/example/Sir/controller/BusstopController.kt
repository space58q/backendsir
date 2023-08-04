package com.example.Sir.controller

import com.example.Sir.model.Busstop
import com.example.Sir.service.BusstopService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/busstop")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class BusstopController {
    @Autowired
    lateinit var busstopService: BusstopService

    @GetMapping

    fun list(): ResponseEntity<*> {
        return ResponseEntity(busstopService.list(), HttpStatus.OK)
    }


    @PostMapping


    fun save (@RequestBody busstop: Busstop): ResponseEntity<Busstop> {
        return ResponseEntity(busstopService.save(busstop), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody busstop: Busstop): ResponseEntity<Busstop> {
        return ResponseEntity(busstopService.update(busstop), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName (@RequestBody busstop: Busstop): ResponseEntity<Busstop> {
        return ResponseEntity(busstopService.updateName(busstop), HttpStatus.OK)
    }


}