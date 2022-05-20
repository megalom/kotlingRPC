package com.megalom.grpcclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GRpcServerApplication

fun main(args: Array<String>) {
	runApplication<GRpcServerApplication>(*args)
}
