package com.geekster.Best_Restaurant_Application.Controller;

import com.geekster.Best_Restaurant_Application.Model.Restaurant;
import com.geekster.Best_Restaurant_Application.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("Restaurants")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("Restaurant/{GivenId}")
    public Restaurant getRestaurantById(@PathVariable Long GivenId){
        return restaurantService.getRestaurantById(GivenId);
    }

    @PostMapping("Restaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
         return restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("Restaurant/{GivenId}/speciality/{speciality}")
    public String changeSpeciality(@PathVariable Long GivenId, @PathVariable String speciality){
        return restaurantService.changeSpeciality(GivenId, speciality);
    }

    @DeleteMapping("Restaurant/{GivenId}")
    public String deleteRestaurant (@PathVariable Long GivenId){
        return restaurantService.deleteRestaurant(GivenId);
    }



}
