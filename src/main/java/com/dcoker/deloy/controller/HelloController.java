package com.dcoker.deloy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcoker.deloy.model.Message;
import com.dcoker.deloy.repository.MessageRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private MessageRepository messageRepo;

    @PostMapping("/register")
    public String register(@RequestBody Message message) {
        messageRepo.save(message);
        return "Succesfully Regiestered";
    }
    

    @GetMapping("/hello")
    public String getMethodName() {
        return messageRepo.findAll().get(0).getMessage();
    }
    
    
}
