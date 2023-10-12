package com.geekster.Restaurant_management.Service;

import com.geekster.Restaurant_management.Model.Order;
import com.geekster.Restaurant_management.Model.User;
import com.geekster.Restaurant_management.Repository.IOrderRepo;
import com.geekster.Restaurant_management.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepo iOrderRepo;

    @Autowired
    IUserRepo iUserRepo;

    public String placeOrder(Order order, String userEmail, String tokenValue) {

        // finding the user
        User userFromDatabase = iUserRepo.findFirstByUserEmail(userEmail);
        if(userFromDatabase == null){
            return "User not found!!";
        }

        String userType = userFromDatabase.getUserType().toString();
        if(userType.equals("VIEWER")){
            return "VIEWER users can not place order. Please login to place Order!!";
        }
        if(userType.equals("NORMAL")){
            iOrderRepo.save(order);
        }

        return "Only NORMAL users can place order!!";
    }
}
