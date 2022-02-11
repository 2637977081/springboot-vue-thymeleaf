package com.cat.code.vue.thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: lvgang
 * @Desc:
 * @Time: 10:20 2022/2/10
 **/
@SpringBootApplication(scanBasePackages = "com.cat")
@Slf4j
public class Application {
  public static void main(String[] args) {
    log.info("Starting the application...");
    SpringApplication app = new SpringApplication(Application.class);
    app.run(args);
  }
}
