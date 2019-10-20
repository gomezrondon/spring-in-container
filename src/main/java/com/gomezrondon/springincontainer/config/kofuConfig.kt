package com.gomezrondon.springincontainer.config


import com.gomezrondon.springincontainer.service.ControllerHandler
import org.springframework.context.support.BeanDefinitionDsl
import org.springframework.context.support.beans
import org.springframework.web.servlet.function.router

fun config(): BeanDefinitionDsl = beans {

    bean {
        val handler = ControllerHandler(ref())
        router {
            "/time".nest {
                GET("/", handler::justATest)
            }

            "/delete".nest {
                DELETE("/", handler::deleteAll)
            }
        }
    }

}