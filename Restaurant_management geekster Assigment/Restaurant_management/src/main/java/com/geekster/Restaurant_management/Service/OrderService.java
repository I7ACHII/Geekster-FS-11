package com.geekster.Restaurant_management.Service;

import com.geekster.Restaurant_management.Model.Order;
import com.geekster.Restaurant_management.Repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepo iOrderRepo;

    public String placeOrder(Order order, String userEmail, String tokenValue) {

    }
}
