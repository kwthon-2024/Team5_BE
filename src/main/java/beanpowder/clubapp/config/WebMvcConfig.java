package beanpowder.clubapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // 모든 엔드포인트에 대해 CORS 허용
                        .allowedOrigins("https://clubapp.onrender.com" ,"http://127.0.0.1:3000", "http://127.0.0.1:3002", "http://127.0.0.1:3003", "http://127.0.0.1:3003", "http://127.0.0.1:3004", "http://127.0.0.1:3005", "http://localhost:3000") // 허용할 프론트엔드 도메인
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 허용할 HTTP 메서드
                        .allowedHeaders("*") // 모든 헤더 허용
                        .allowCredentials(true); // 쿠키 및 인증 정보 허용
            }
        };
    }
}
