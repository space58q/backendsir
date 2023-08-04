package com.example.Sir.service

import com.example.Sir.model.Busstop
import com.example.Sir.repository.BusstopRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class BusstopService {
    @Autowired
    lateinit var busstopRepository: BusstopRepository

    fun list ():List<Busstop>{
        return busstopRepository.findAll() //llama al metodo del metodo del repositorio y llama a cada uno de los metodos
    }

    fun save (busstop: Busstop): Busstop {
        try {
            return busstopRepository.save(busstop)
        } catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun update(busstop: Busstop): Busstop {
        try {
            busstopRepository.findById(busstop.id)
                    ?: throw Exception("ID no existe")

            return busstopRepository.save(busstop)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun updateName(busstop: Busstop): Busstop {
        try{
            val response = busstopRepository.findById(busstop.id)
                    ?: throw Exception("ID no existe")
            response.apply {
                name=busstop.name
            }
            return busstopRepository.save(response)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }






}
