package org.gary.webproject;

import org.gary.webproject.event.AppListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: gary kwok
 * @Date: 2019/11/25 9:21
 */
@SpringBootApplication(scanBasePackages = "org.gary")
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new AppListener());
        app.run(args);
    }
}
