package com.vgrigore.gym.trainer.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Spring Boot Start App class
 * Main method handles startup of the application
 *
 */
@SpringBootApplication(scanBasePackages = "com.vgrigore.gym.trainer")
public class SpringBootStartup {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStartup.class);
    }

}
