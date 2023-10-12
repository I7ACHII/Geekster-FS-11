package com.geekster.Restaurant_management.Controller;


import com.geekster.Restaurant_management.Model.Order;
import com.geekster.Restaurant_management.Service.AuthenticationtokenService;
import com.geekster.Restaurant_management.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    AuthenticationtokenService authenticationtokenService;

    @PostMapping("placeOrder/{userEmail}/{tokenValue}")
    public String placeOrder (@RequestBody Order order, @PathVariable String userEmail, @PathVariable String tokenValue){
        if(authenticationtokenService.Authenticate(userEmail, tokenValue))
        return orderService.placeOrder(order, userEmail, tokenValue);
    }
}
