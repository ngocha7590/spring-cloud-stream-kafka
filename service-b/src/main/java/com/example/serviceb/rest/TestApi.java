package com.example.serviceb.rest;

import com.example.kafka.DevOps;
import com.example.serviceb.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HaVN
 */
@RestController
public class TestApi {

    @Autowired
    MessageService messageService;

    @GetMapping("/send")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void callB(@RequestParam("message") String message) {

        messageService.sendGreeting(
                DevOps.builder().id(12).name("ssssssssssssssssssssssssssssssssssssssssssss")
                        .build());
    }
}
