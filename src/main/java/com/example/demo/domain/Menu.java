package com.example.demo.domain;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(exclude = "restaurant")
@Getter
@NoArgsConstructor
@Table(name = "table_menu")
@Entity
public class Menu extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")
    private String name;

    @Column(name = "food_type")
    @Enumerated(EnumType.STRING)
    private FoodType foodType;

    @Column(name = "score")
    private Double score;

    @Column(name = "description1", length = 2047)
    private String description;

    // Entity?
    @Column(name = "evaluator")
    private String evaluator;

    @ManyToOne
    private Restaurant restaurant;

    @Builder
    public Menu(final String name, final String evaluator, final Double score,
                final Restaurant restaurant, final String description, final FoodType foodType) {
            this.name = name;
            this.evaluator = evaluator;
            this.score = score;
            this.restaurant = restaurant;
            this.restaurant.addMenu(this);
            this.description = description;
            this.foodType = foodType;
    }
}
