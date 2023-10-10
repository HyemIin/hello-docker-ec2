package com.example.hello_docker_ec2.service;

import com.example.hello_docker_ec2.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    Repository repository;
}
