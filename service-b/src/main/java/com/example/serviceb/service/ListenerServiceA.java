package com.example.serviceb.service;

import com.example.serviceb.binder.ServiceAStream;
import com.example.serviceb.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @author HaVN
 */
@Component
@Slf4j
public class ListenerServiceA {
  @StreamListener(ServiceAStream.INPUT)
  public void handleGreetings(@Payload Message mess) {
    log.info("Received Message: {}", mess);
  }
}
