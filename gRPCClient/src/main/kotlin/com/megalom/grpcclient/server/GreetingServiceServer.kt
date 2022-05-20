package com.megalom.grpcclient.server

import io.grpc.ServerBuilder

open class GreetingServiceServer {

    open fun start(){
        val server = ServerBuilder.forPort(8080)
            .addService(GreetingServiceImpl())
            .build()
        server.start()
        println("Server started")
        server.awaitTermination()
    }
}