package com.example.serviceb.binder;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author HaVN
 */
public interface ServiceAStream {
  String INPUT = "service-a-in";
  String OUTPUT = "service-a-out";

  @Input(INPUT)
  SubscribableChannel inboudServiceA();

  @Output(OUTPUT)
  MessageChannel outboundServiceA();
}
