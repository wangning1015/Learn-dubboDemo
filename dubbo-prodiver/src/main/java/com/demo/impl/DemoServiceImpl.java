package com.demo.impl;

import org.springframework.stereotype.Service;

import com.demo.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return name; 
    }
}
