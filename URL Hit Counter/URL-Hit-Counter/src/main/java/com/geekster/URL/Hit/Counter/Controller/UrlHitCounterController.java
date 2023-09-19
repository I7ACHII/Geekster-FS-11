package com.geekster.URL.Hit.Counter.Controller;

import com.geekster.URL.Hit.Counter.Model.User;
import com.geekster.URL.Hit.Counter.Service.UrlHitCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UrlHitCounterController {

    @Autowired
    UrlHitCounterService urlHitCounterService;

    @GetMapping("allUsers")
    public List<User> getAllUsers(){
        return urlHitCounterService.getAllUsers();
    }

    @GetMapping("count/{username}")
    public String getCount(@PathVariable String username){
        return urlHitCounterService.getCount(username);
    }

    @PostMapping("count/{username}")
    public String incrementCount(@PathVariable String username){
        return urlHitCounterService.incrementCount(username);
    }
}
