package com.geekster.URL.Hit.Counter.Repository;


import com.geekster.URL.Hit.Counter.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UrlHitCounterRepo {

    @Autowired
    List<User> userList ;

    public List<User> getUserList() {
        return userList;
    }
}
