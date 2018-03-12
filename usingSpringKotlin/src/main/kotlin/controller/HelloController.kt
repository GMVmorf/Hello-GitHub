package ru.mgprojects.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.mgprojects.model.Hello
import java.util.concurrent.atomic.AtomicLong

@RestController
class HelloController {

    val counter = AtomicLong()

    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String): String = Hello(counter.incrementAndGet(), "Hello, $name").toString()

}