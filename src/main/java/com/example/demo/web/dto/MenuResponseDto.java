package com.example.demo.web.dto;

import java.time.LocalDateTime;

import com.example.demo.domain.FoodType;
import com.example.demo.domain.Menu;
import com.example.demo.domain.Restaurant;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MenuResponseDto {
    
    private String name;
    private Double score;
    private Long resNo;
    private String resName;
    private String foodType;
    private String evaluator;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @Builder
    public MenuResponseDto(final Menu menu, final Restaurant restaurant) {
        this.name = menu.getName();
        this.score = menu.getScore();
        this.foodType = menu.getFoodType().getName();
        this.evaluator = menu.getEvaluator();
        this.resNo = restaurant.getId();
        this.resName = restaurant.getName();
        this.createdDate = menu.getCreatedDate();
        this.modifiedDate = menu.getModifiedDate();
    }
}
