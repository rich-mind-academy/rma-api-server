package com.rich_mind_academy.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
@PropertySource("classpath:application-\${spring.profiles.active:local}.properties")
class ApiApplication

fun main(args: Array<String>) {
	runApplication<ApiApplication>(*args)
}
