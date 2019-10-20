package com.gomezrondon.springincontainer

import com.gomezrondon.springincontainer.config.config
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args){
        addInitializers(config())
    }
}