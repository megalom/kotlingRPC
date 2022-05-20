package com.megalom.grpcclient.client

import com.megalom.gRPCServer.GreetingServiceGrpc
import com.megalom.gRPCServer.GreetingServiceOuterClass
import io.grpc.ManagedChannelBuilder
import org.springframework.stereotype.Service

@Service
open class ClientService {

    open fun getGreeting():String{
        val channel = ManagedChannelBuilder.forTarget("localhost:8085").usePlaintext().build()
        val stub = GreetingServiceGrpc.newBlockingStub(channel)
        val request = GreetingServiceOuterClass.HelloRequest.newBuilder().setName("User").build()

        val response = stub.greeting(request)
        channel.shutdown()

        return response.greeting
    }
}