package com.megalom.gRPCServer

open class GreetingServiceImpl: GreetingServiceGrpcKt.GreetingServiceCoroutineImplBase() {
    open fun test(){
        println("test")
    }
    override suspend fun greeting(request: GreetingServiceOuterClass.HelloRequest): GreetingServiceOuterClass.HelloResponse {
        println("greeting method called")
        println(request)
        val response = GreetingServiceOuterClass.HelloResponse.newBuilder()
            .setGreeting("Hello form server, "+request.name)
            .build()
        return response
    }
}