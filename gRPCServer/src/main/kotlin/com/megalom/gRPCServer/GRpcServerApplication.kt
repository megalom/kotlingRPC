package com.megalom.gRPCServer

//@SpringBootApplication
class GRpcServerApplication

fun main(args: Array<String>) {
	GreetingServiceServer().start()
	//runApplication<GRpcServerApplication>(*args)
}
