package com.geekster.URL.Hit.Counter.Configuration;


import com.geekster.URL.Hit.Counter.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class BeanFactory {

    @Bean
    public List<User> getCounterMap(){
        List<User> userList = new ArrayList<>();
        return userList;
    }

}
