package com.pluralsight.controller;

import com.pluralsight.entity.Application;
import com.pluralsight.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationRepository applicationRepository;
    @Autowired
    private ApplicationRepository releaRepository;
    @Autowired
    private ApplicationRepository tickRepository;
    @GetMapping("/application")
    public List<Application> getAllApplications(){
        List<Application> applications = (List<Application>) applicationRepository.findAll();
        return applications;
    }

    @GetMapping("/application/{id}")
    public Optional<Application> getApplication(@PathVariable int id){
        Optional<Application> application = applicationRepository.findById(id);
        if(!application.isPresent()){
            throw  new NoSuchElementException();
        }
        return application;
    }

    @PostMapping("/application")
    public void saveApplication(@RequestBody Application a){
        applicationRepository.save(a);
    }
}
