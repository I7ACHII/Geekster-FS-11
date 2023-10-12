package com.geekster.Restaurant_management.Service;


import com.geekster.Restaurant_management.Model.AuthenticationToken;
import com.geekster.Restaurant_management.Model.User;
import com.geekster.Restaurant_management.Repository.IAuthenticationToken;
import com.geekster.Restaurant_management.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationtokenService {

    @Autowired
    IAuthenticationToken iAuthenticationToken;

    @Autowired
    IUserRepo iUserRepo;

    public Boolean Authenticate(String userEmail, String authToken) {
        AuthenticationToken authentication = iAuthenticationToken.findFirstByTokenValue(authToken);
        if(authentication == null){
            return false;
        }

        if(! authentication.getUser().getUserEmail().equals(userEmail)){
            return false;
        }
        return true;
    }
}
