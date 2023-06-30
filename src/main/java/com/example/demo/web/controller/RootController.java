package com.example.demo.web.controller;

import com.example.demo.repository.MenuRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MenuService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
//@Controller
@RestController
public class RootController {
    
    private final MenuService service;
    private final MenuRepository menuRepository;
    
    @GetMapping("/")
    public String mainHandler() {
        menuRepository.findAll().forEach(m -> System.out.println(m));
        return "test";
    }
}
