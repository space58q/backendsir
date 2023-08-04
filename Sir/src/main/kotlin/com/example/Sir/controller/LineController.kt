package com.example.Sir.controller

import com.example.Sir.model.Busstop
import com.example.Sir.model.Line
import com.example.Sir.service.BusstopService
import com.example.Sir.service.LineService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/line")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])

class LineController {
    @Autowired
    lateinit var lineService: LineService

    @GetMapping

    fun list(): ResponseEntity<*> {
        return ResponseEntity(lineService.list(), HttpStatus.OK)
    }


    @PostMapping


    fun save (@RequestBody line: Line): ResponseEntity<Line> {
        return ResponseEntity(lineService.save(line), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody line: Line): ResponseEntity<Line> {
        return ResponseEntity(lineService.update(line), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName (@RequestBody line: Line): ResponseEntity<Line> {
        return ResponseEntity(lineService.updateNumber(line), HttpStatus.OK)
    }

}