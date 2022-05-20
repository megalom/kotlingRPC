package com.megalom.gRPCServer

import io.grpc.ServerBuilder

open class GreetingServiceServer {

    open fun start(){
        val service = GreetingServiceImpl()
        service.test()
        //print("service test:"+service.greeting(GreetingServiceOuterClass.HelloRequest.newBuilder().setName("testName").build()))
        val server = ServerBuilder.forPort(8085)
            .addService(service)
            .build()
        server.start()
        println("Server started")
        server.awaitTermination()
    }
}