package com.example.serviceb;

import com.example.serviceb.binder.ServiceAStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ServiceAStream.class)
public class ServiceBApplication {

  public static void main(String[] args) {

    SpringApplication.run(ServiceBApplication.class, args);
  }

}
