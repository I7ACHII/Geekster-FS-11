package com.geekster.Best_Restaurant_Application.Configuration;

import com.geekster.Best_Restaurant_Application.Model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<Restaurant> getInitializedList(){
        List<Restaurant> RestaurantList = new ArrayList<>();
        Restaurant firstRestaurant = new Restaurant(1112L, "Thai High", "New Delhi", "45673645", "Paneer Butter Masala", 60, 4);
        RestaurantList.add(firstRestaurant);
        return RestaurantList;
    }
}
