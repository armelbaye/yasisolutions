package com.example.loginservice.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan (basePackages = "com.example.loginservice.repository")
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(){
       return DataSourceBuilder
               .create()
               .build();
    }
}
