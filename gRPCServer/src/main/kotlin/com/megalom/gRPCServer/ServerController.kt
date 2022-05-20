package com.megalom.gRPCServer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ServerController {
    @GetMapping( "/hello")
    fun helloWorld():String{
        return "Hello!"
    }
}