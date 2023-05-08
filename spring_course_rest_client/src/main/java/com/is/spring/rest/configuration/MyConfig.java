package com.is.spring.rest.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.is.spring.rest")
public class MyConfig {

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
