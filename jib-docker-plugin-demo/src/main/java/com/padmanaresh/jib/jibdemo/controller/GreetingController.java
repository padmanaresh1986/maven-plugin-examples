package com.padmanaresh.jib.jibdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class GreetingController {
    Logger logger = LoggerFactory.getLogger(GreetingController.class);

    Environment env;
    public GreetingController(Environment env){
        this.env = env;
    }

    @GetMapping
    public String getGreeting(){
        logger.info("Got request " + Instant.now());
        logger.info("Env Variables ### " + env.getProperty("ENV_KEY1"));
        return "Hello World "+env.getProperty("ENV_KEY1");
    }

}
