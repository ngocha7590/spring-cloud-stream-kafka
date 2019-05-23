package com.example.servicea;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ServiceBStream.class)
public class ServiceAApplication {
  private final Log logger = LogFactory.getLog(getClass());
  public static void main(String[] args) {
    SpringApplication.run(ServiceAApplication.class, args);
  }

}
