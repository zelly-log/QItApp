package com.ll.qitapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // class 설정 파일
public class WebConfig {

    @Bean // 객체 생성 및 관리
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) { // 허용 규칙 정의
                registry.addMapping("/**") // 백엔드 모든 엔드포인트를 cors 허용
                        .allowedOrigins("http://localhost:3000") // React 요청 허용
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") //허용할 HTTP 메서드
                        .allowedHeaders("*") // 모든 헤더 허용
                        .allowCredentials(true); // 쿠키 & 인증 정보 포함 허용

            }
        };
    }
}
