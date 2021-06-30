package com.example.demo.zero.downtime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
  
  @GetMapping("/hello")
  public String hello() {
    try {
      long timeToWaitInMillis = (long)(Math.random() * 10000);
      Thread.sleep(timeToWaitInMillis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "Hello World";
  }
}
