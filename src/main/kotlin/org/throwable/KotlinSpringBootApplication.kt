package org.throwable

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/10/18 16:00
 */
@SpringBootApplication
open class KotlinSpringBootApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringBootApplication::class.java, *args)
}