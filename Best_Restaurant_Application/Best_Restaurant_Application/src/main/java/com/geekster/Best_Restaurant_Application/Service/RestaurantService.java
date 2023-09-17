package com.geekster.Best_Restaurant_Application.Service;

import com.geekster.Best_Restaurant_Application.Model.Restaurant;
import com.geekster.Best_Restaurant_Application.Repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.getRestaurantList();
    }

    public String addRestaurant(Restaurant restaurant) {
        List<Restaurant> restaurantList = restaurantRepo.getRestaurantList();
        restaurantList.add(restaurant);
        return "Restaurant has been added!";
    }

    public Restaurant getRestaurantById(Long givenId) {
        List<Restaurant> restaurantList = restaurantRepo.getRestaurantList();
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getRestaurantId().equals(givenId)){
                return restaurant;
            }
        }
        return null;
    }


    public String changeSpeciality(Long givenId, String speciality) {
        List<Restaurant> restaurantList = restaurantRepo.getRestaurantList();
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getRestaurantId().equals(givenId)){
                restaurant.setRestaurantSpeciality(speciality);
                return "Speciality has been added!!";
            }
        }
        return "Restaurant not found!!";
    }

    public String deleteRestaurant(Long givenId) {
        List<Restaurant> restaurantList = restaurantRepo.getRestaurantList();
        for(Restaurant restaurant : restaurantList) {
            if (restaurant.getRestaurantId().equals(givenId)) {
                restaurantList.remove(restaurant);
                return "Restaurant has been Deleted!!";
            }
        }
        return "Restaurant not found!!";
    }
}
