package org.gary.webproject.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @Author: gary kwok
 * @Date: 2019/11/25 9:24
 */
public class AppListener implements ApplicationListener {
    private static Logger logger = LoggerFactory.getLogger(AppListener.class);

    public void onApplicationEvent(ApplicationEvent event) {
        // 在这里可以监听到Spring Boot的生命周期
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            logger.info("初始化环境变量");
        } else if (event instanceof ApplicationPreparedEvent) {
            logger.info("初始化完成");
        } else if (event instanceof ContextRefreshedEvent) {
            logger.info("应用刷新");
        } else if (event instanceof ApplicationReadyEvent) {
            logger.info("应用已启动完成");
        } else if (event instanceof ContextStartedEvent) {
            logger.info("应用启动，需要在代码动态添加监听器才可捕获");
        } else if (event instanceof ContextStoppedEvent) {
            logger.info("应用停止");
        } else if (event instanceof ContextClosedEvent) {
            logger.info("应用关闭");
        } else {
            logger.info("event" + event.toString());
        }
    }
}
