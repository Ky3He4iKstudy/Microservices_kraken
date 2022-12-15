package dev.ky3he4ik.micro_9_1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class Application {
//    @Autowired
//    lateinit var storageController: StorageController
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
