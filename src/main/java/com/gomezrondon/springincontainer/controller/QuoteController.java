package com.gomezrondon.springincontainer.controller;


import com.gomezrondon.springincontainer.entitie.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;


@RestController
@RequestMapping("/quote")
public class QuoteController {

    private static final Logger logger = LoggerFactory.getLogger(QuoteController.class);

    @PostMapping(value={"/add", MediaType.APPLICATION_JSON_VALUE} )
    public Quote justAQuote(@RequestBody final Quote quote){

        logger.info("Quote inserted: {} ",quote);

        //faking a service/database
        String uniqueID = UUID.randomUUID().toString();
        quote.setId(uniqueID);

        return quote;
    }

}
