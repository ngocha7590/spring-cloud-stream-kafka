package com.example.servicea;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author HaVN
 */
public interface ServiceBStream {
  String INPUT = "service-b-in";
  String OUTPUT = "service-b-out";

  @Input(INPUT)
  SubscribableChannel inboudServiceB();

  @Output(OUTPUT)
  MessageChannel outboundServiceB();
}
