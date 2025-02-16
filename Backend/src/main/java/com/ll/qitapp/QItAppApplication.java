package com.ll.qitapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

// Redis 자동 설정 제외
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
public class QItAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(QItAppApplication.class, args);
    }

}
