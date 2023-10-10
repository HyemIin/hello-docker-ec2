package com.example.hello_docker_ec2.repository;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class MapRepository implements Repository {

    Map<Integer, String> db = new HashMap<>();
    int id = 0;


    public void save(String data) {
        db.put(id++, data);
    }

    public void findById(int id) {
        db.get(id);
    }
}
