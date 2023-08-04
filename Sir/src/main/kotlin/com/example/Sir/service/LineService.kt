package com.example.Sir.service

import com.example.Sir.model.Busstop
import com.example.Sir.model.Line
import com.example.Sir.repository.BusstopRepository
import com.example.Sir.repository.LineRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class LineService {
    @Autowired
    lateinit var lineRepository: LineRepository

    fun list ():List<Line>{
        return lineRepository.findAll() //llama al metodo del metodo del repositorio y llama a cada uno de los metodos
    }

    fun save (line: Line): Line {
        try {
            return lineRepository.save(line)
        } catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun update(line: Line): Line {
        try {
            lineRepository.findById(line.id)
                    ?: throw Exception("ID no existe")

            return lineRepository.save(line)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun updateNumber(line: Line): Line {
        try{
            val response = lineRepository.findById(line.id)
                    ?: throw Exception("ID no existe")
            response.apply {
                number=line.number
            }
            return lineRepository.save(response)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}