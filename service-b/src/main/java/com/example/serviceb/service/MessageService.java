package com.example.serviceb.service;

import com.example.serviceb.binder.ServiceAStream;
import com.example.serviceb.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

/**
 * @author HaVN
 */
@Service
public class MessageService {

  private static final Logger log = LoggerFactory.getLogger(MessageService.class);
  private final ServiceAStream serviceAStream;

  public MessageService(ServiceAStream serviceAStream) {
    this.serviceAStream = serviceAStream;
  }

  public void sendGreeting(final Message greetings) {
    log.info("Sending messeage {}", greetings);
    MessageChannel messageChannel = serviceAStream.outboundServiceA();
    messageChannel.send(MessageBuilder
        .withPayload(greetings)
        .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
        .build());

  }
}
