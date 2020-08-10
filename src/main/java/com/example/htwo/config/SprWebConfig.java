package com.example.htwo.config;

import com.example.htwo.component.SprMvcInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SprWebConfig implements WebMvcConfigurer {
    @Bean
    public SprMvcInterceptor loginInterceptor() {
        return new SprMvcInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login/loginsave")
        ;
    }
}
