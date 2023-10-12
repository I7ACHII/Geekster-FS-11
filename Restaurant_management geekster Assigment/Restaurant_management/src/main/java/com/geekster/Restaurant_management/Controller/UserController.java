package com.geekster.Restaurant_management.Controller;


import com.geekster.Restaurant_management.Model.User;
import com.geekster.Restaurant_management.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user/signUp")
    public String signUpUser(@RequestBody User user){
        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn/{userEmail}/{UserPassword}")
    public String signInUser(@PathVariable String userEmail, @PathVariable String UserPassword) {
        return userService.signInUser(userEmail, UserPassword);
    }
}
