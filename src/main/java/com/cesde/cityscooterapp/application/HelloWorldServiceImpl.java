package com.cesde.cityscooterapp.application;


import com.cesde.cityscooterapp.application.inpurport.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {


    @Override
    public String createSalute() {
        return "Hello World From ServiceImpl";
    }
}
