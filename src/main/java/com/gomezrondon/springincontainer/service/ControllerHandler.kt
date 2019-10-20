package com.gomezrondon.springincontainer.service

import com.gomezrondon.springincontainer.entitie.TimeEntity
import org.slf4j.LoggerFactory
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse
import java.time.LocalDateTime


class ControllerHandler(private val  service:TimeService) {
    private val logger = LoggerFactory.getLogger(ControllerHandler::class.java)

    fun justATest(request: ServerRequest): ServerResponse {
        val time:TimeEntity =  TimeEntity(LocalDateTime.now().toString())
        service.saveTime(time);
        logger.info("Time inserted: {} ",time);
        val all = service.findAll()
        all.forEach(System.out::println);

        return ServerResponse.ok().body(all)
    }


    fun deleteAll(request: ServerRequest): ServerResponse =  ServerResponse.ok().body(service.deleteAll())

}