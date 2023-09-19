package com.geekster.URL.Hit.Counter.Service;

import com.geekster.URL.Hit.Counter.Model.User;
import com.geekster.URL.Hit.Counter.Repository.UrlHitCounterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UrlHitCounterService {

    @Autowired
    UrlHitCounterRepo urlHitCounterRepo;

    public String getCount(String username) {
        List<User> allUsers = urlHitCounterRepo.getUserList();
        for(User user : allUsers){
            if(user.getUsername().equals(username)){
                return "count:" + user.getCount();
            }
        }
        return "User not found!!";
    }

    public String incrementCount(String username) {
        List<User> allUsers = urlHitCounterRepo.getUserList();
        int flag = 0;
        for(User user : allUsers){
            if(user.getUsername().equals(username)){
                user.setCount(user.getCount() + 1);
                flag = 1;
                return "count of username:"+username+" updated to " + user.getCount();
            }
        }
        if(flag == 0){
            User newUser = new User(username,1);
            urlHitCounterRepo.getUserList().add(newUser);
            return "New User created with username "+username+" and count:1 ";
        }
        return "Something went wrong!!";
    }

    public List<User> getAllUsers() {
        return urlHitCounterRepo.getUserList();
    }
}
