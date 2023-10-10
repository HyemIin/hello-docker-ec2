package com.example.hello_docker_ec2;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDockerEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloDockerEc2Application.class, args);
	}



}
