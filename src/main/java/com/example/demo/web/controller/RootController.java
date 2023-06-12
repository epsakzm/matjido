package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MenuService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class RootController {
    
    private final MenuService service; 
    
    @GetMapping("/")
    public String mainHandler() {
        return "test";
    }
}
