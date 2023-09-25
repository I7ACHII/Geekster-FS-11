package com.geekster.User.Management.System.Controller;

import com.geekster.User.Management.System.Model.User;
import com.geekster.User.Management.System.Service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.constraints.Email;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("user/userId/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping("user")
    public String addUser( @Valid @RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("users")
    public List<User> getAllUsers (){
        return userService.getAllUsers();
    }

    @PutMapping("user/Id/{userId}/Address/{address}")
    public String updateAddress (@PathVariable Long userId, @PathVariable String address){
        return userService.updateAddress(userId, address);
    }

    @PutMapping("user/Id/{userId}/phoneNo/{phoneNo}")
    public String updatePhone (@PathVariable  Long userId, @PathVariable String phoneNo){
        return userService.updatePhone(userId, phoneNo);
    }

    @DeleteMapping("user/userId/{userId}")
    public String removeUser(@PathVariable  Long userId){
        return userService.removeUser(userId);
    }
}
