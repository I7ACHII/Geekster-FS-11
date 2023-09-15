package com.geekster.User.Management.System.Service;

import com.geekster.User.Management.System.Model.User;
import com.geekster.User.Management.System.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    public User getUser(Long userId) {
        List<User> users = userRepo.getAllUsers();
        for(User user : users){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    public String addUser(User user) {
        List<User> users = userRepo.getAllUsers();
        users.add(user);

        return "User has been added!!";
    }

    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }

    public String updateAddress(Long userId, String address) {
        List<User> users = userRepo.getAllUsers();
        for(User user : users){
            if(user.getUserId().equals(userId)){
                user.setAddress(address);
            }
        }
        return "address has been updated!!";
    }

    public String updatePhone(Long userId, Long phoneNo) {
        List<User> users = userRepo.getAllUsers();
        for(User user : users){
            if(user.getUserId().equals(userId)){
                user.setPhoneNo(phoneNo);
                return "Phone Number has been updated!!";
            }
        }
        return "User not found!!";
    }

    public String removeUser(Long userId) {
        List<User> users = userRepo.getAllUsers();
        for(User user : users){
            if(user.getUserId().equals(userId)){
                users.remove(user);
                return "User has been removed";
            }
        }
        return "User has been removed";
    }
}
