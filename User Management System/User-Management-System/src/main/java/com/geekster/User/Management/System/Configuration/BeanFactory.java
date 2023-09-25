package com.geekster.User.Management.System.Configuration;


import com.geekster.User.Management.System.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<User> getInitializedList(){
        User user = new User(9128L, "Itachi", "I7ACHI", "itachi@gmail.com","New Delhi", "919578565567");
        List<User> newList = new ArrayList<>();
        newList.add(user);
        return newList;
    }
}
