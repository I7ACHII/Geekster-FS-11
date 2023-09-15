package com.geekster.User.Management.System.Repository;

import com.geekster.User.Management.System.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {

    @Autowired
    public List<User> userList;

    public List<User> getAllUsers(){
        return userList;
    }
}
