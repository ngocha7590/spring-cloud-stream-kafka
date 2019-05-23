package com.example.serviceb.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author HaVN
 */
@Getter @Setter  @Builder @ToString
public class Message {
  private long timestamp;
  private String message;

}