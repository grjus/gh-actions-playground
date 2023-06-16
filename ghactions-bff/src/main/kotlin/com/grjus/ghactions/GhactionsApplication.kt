package com.grjus.ghactions

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GhactionsApplication

fun main(args: Array<String>) {
	runApplication<GhactionsApplication>(*args)
}
