package com.gomezrondon.springincontainer.controller;


import com.gomezrondon.springincontainer.entitie.TimeEntity;
import com.gomezrondon.springincontainer.service.TimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    private final TimeService service;

    public Controller(TimeService service) {
        this.service = service;
    }

    @GetMapping("/time")
    public List<TimeEntity> justATest(){

        TimeEntity time = new TimeEntity(LocalDateTime.now().toString());
        service.saveTime(time);
        logger.info("Time inserted: {} ",time);

        List<TimeEntity> all = service.findAll();
        all.forEach(System.out::println);

        return all;
    }

    @DeleteMapping("/delete")
    public void deleteAll() {
        service.deleteAll();
    }

}
