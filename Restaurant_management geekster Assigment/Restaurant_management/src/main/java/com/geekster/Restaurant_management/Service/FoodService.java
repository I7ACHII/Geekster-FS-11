package com.geekster.Restaurant_management.Service;


import com.geekster.Restaurant_management.Model.FoodItem;
import com.geekster.Restaurant_management.Repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    IFoodRepo iFoodRepo;
    public String addFood(FoodItem foodItem) {
        iFoodRepo.save(foodItem);
        return "foodItem has been added!!";
    }
}

