package com.example.htwo.config;

import com.example.htwo.component.SprInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SprWebConfigurer implements WebMvcConfigurer {
    @Bean
    public SprInterceptor loginInterceptor() {
        return new SprInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login/loginsave")
        ;
    }
}
