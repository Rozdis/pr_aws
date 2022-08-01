package com.example.project_to_aws.response;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
  @GetMapping(path = "hello")
  public String helloEndpoint(@RequestParam(value = "name", defaultValue = "katya") String name) {
    return String.format("Hello %s", name);
  }
}
