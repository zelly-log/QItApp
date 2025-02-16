package com.ll.qitapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean // Spring 반환된 객체 관리
    // 보안 필터 정의하는 메서드
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // CSRF 보안 비활성화 (API 호출 테스트용)
            .authorizeHttpRequests(auth -> auth // CSRF 공격 방지 비활성화 (API 호출 테스트용)
                .requestMatchers("api/**").permitAll() // "/api/**"로 시작하는 모든 요청 허용
                .anyRequest().authenticated() // 나머지 모든 요청은 로그인 필요
        )
            .formLogin(form -> form.disable()) // 로그인 폼 비활성화
            // formLogin 설정이 없으면 login 페이지로 리다이렉트 됨
            .httpBasic(basic -> basic.disable());
            //jwt 인증을 사용하기 때문에 브라우저 팝업을 띄워 사용자 인증 요구 방식 비활성화


        return http.build();
    }
}
