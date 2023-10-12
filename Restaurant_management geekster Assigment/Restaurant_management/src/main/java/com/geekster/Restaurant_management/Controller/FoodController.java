package com.geekster.Restaurant_management.Controller;


import com.geekster.Restaurant_management.Model.FoodItem;
import com.geekster.Restaurant_management.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// For All the APIs
@RestController
public class FoodController {

    @Autowired
    FoodService foodService;

    @PostMapping("food")
        public String addFood(@RequestBody FoodItem foodItem){
            return foodService.addFood(foodItem);
        }

}
