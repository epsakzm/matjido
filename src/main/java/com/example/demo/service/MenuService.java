package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Menu;
import com.example.demo.repository.MenuRepository;
import com.example.demo.repository.RestaurantRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class MenuService {
    
    private final MenuRepository mr;
    private final RestaurantRepository rr;

    //CRUD
    
}
