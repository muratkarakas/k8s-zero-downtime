package com.example.demo.zero.downtime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
  
  @GetMapping("/hello")
  public String hello() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "Hello World";
  }
}
