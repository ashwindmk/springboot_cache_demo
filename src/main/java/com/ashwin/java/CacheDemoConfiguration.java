package com.ashwin.java;

import com.ashwin.java.data.source.StudentSource;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheDemoConfiguration {
    @Bean
    public StudentSource studentSource() {
        return new StudentSource();
    }
}
