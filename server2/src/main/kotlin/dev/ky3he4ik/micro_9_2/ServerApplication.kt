package dev.ky3he4ik.micro_9_2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class TestApplication

fun main(args: Array<String>) {
    runApplication<TestApplication>(*args)
}

@RestController
@RequestMapping("/get_data")
class TestApplicationWeb {
    @GetMapping
    fun test(): String = "{\"data\": \"Server 2 this is\"}"
}
