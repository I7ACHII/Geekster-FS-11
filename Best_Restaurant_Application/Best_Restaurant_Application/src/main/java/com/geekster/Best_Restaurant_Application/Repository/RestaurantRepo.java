package com.geekster.Best_Restaurant_Application.Repository;

import com.geekster.Best_Restaurant_Application.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {

    @Autowired
    List<Restaurant> Restaurants;

    public List<Restaurant> getRestaurantList (){
        return Restaurants;
    }
}
