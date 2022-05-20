package com.megalom.grpcclient.server


import com.megalom.gRPCServer.GreetingServiceGrpcKt
import com.megalom.gRPCServer.GreetingServiceOuterClass
import io.grpc.stub.StreamObserver

open class GreetingServiceImpl: GreetingServiceGrpcKt.GreetingServiceCoroutineImplBase() {
    @Override
    open fun greeting(request: GreetingServiceOuterClass.HelloRequest,
                      responseObserver:StreamObserver<GreetingServiceOuterClass.HelloResponse>){
        println(request)
        val response = GreetingServiceOuterClass.HelloResponse.newBuilder()
            .setGreeting("Hello form server, "+request.name)
            .build()
        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }
}