package com.megalom.grpcclient.client

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ServerController @Autowired constructor(private val clientService: ClientService) {
    @GetMapping( "/hello")
    fun helloWorld():String{
        return clientService.getGreeting()
    }
}