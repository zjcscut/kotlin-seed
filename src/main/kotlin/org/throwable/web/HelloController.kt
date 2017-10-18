package org.throwable.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/10/18 16:04
 */
@RestController
class HelloController {

    @GetMapping(value = "/hello")
    fun helloKotlin(): String {
        return "Hello Kotlin"
    }
}