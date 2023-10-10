package com.example.hello_docker_ec2;

import com.example.hello_docker_ec2.repository.DBRepository;
import com.example.hello_docker_ec2.repository.MapRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    public MapRepository mapRepository() {
        return new MapRepository();
    }

    @Bean
    public DBRepository dbRepository() {
        return new DBRepository();
    }
}
