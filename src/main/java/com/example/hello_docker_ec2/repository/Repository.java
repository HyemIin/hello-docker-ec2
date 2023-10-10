package com.example.hello_docker_ec2.repository;


public interface Repository {


    void save(String data);

    void findById(int id);
}
