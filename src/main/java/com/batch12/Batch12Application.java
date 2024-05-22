package com.batch12;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@Slf4j
public class Batch12Application {

  public static void main(String[] args) {
    int exit = SpringApplication.exit(SpringApplication.run(Batch12Application.class, args));
    log.info("exit = {}", exit);
    System.exit(exit);
  }

}
