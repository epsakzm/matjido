package com.example.demo;

import com.example.demo.domain.FoodType;
import com.example.demo.domain.Menu;
import com.example.demo.domain.Restaurant;
import com.example.demo.repository.MenuRepository;
import com.example.demo.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private MenuRepository mr;

	@Autowired
	private RestaurantRepository rr;
	@Bean
	public ApplicationRunner run() {
		return args -> {
			Restaurant rest1 = rr.save(Restaurant.builder()
					.name("식당 1")
					.build());
			Menu menu = mr.save(Menu.builder()
					.evaluator("박형우")
					.restaurant(rest1)
					.score(4.5D)
					.name("치즈오븐파스타")
					.description("맛있어요")
							.foodType(FoodType.BUN)
					.build());
		};
	}
}
