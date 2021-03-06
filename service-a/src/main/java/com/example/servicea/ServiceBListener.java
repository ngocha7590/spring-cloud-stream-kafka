package com.example.servicea;

import com.example.kafka.DevOps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @author HaVN
 */
@Component
@Slf4j
public class ServiceBListener {
  public ServiceBListener(){
    log.info("started listener");
  }
  @StreamListener(ServiceBStream.INPUT)
  public void handleGreetings(@Payload DevOps greetings) {

    log.info("Received greetings: {}", greetings);
  }
}