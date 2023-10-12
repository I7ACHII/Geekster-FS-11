package com.geekster.Restaurant_management.Service;

import com.geekster.Restaurant_management.Model.AuthenticationToken;
import com.geekster.Restaurant_management.Model.User;
import com.geekster.Restaurant_management.Repository.IAuthenticationToken;
import com.geekster.Restaurant_management.Repository.IUserRepo;
import com.geekster.Restaurant_management.Service.EmailHandler.emailHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

import static com.geekster.Restaurant_management.Service.Encryption.encryption.encryptPassword;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    @Autowired
    IAuthenticationToken iAuthenticationToken;

    public String signUpUser(User user) {

        // checking if the user has provided a valid email address or not
        String userEmail = user.getUserEmail();
        if (userEmail == null){
            return "Invalid email!!";
        }

        // checking if the user already exist in the database or not by Custom finder method
        User userExist = iUserRepo.findFirstByUserEmail(userEmail);
        if(userExist != null){
            return "User already exist by this email!!";
        }


        // Encrypting the password and then adding to the database

        try {
            String userPass = user.getUserPass();
            String userEncryptedPass = null;
            userEncryptedPass = encryptPassword(userPass);
            user.setUserPass(userEncryptedPass);
            iUserRepo.save(user);
            return "Sign Up successful!!";
        } catch (NoSuchAlgorithmException e) {
            return "Something went wrong!!";
        }
    }

    public String signInUser(String userEmail, String userPassword) {
        if(userEmail == null)
            return "Invalid Email Id!!";

        // Finding user in the database by user email and checking whether given user email Id exists in database or not
        User user = iUserRepo.findFirstByUserEmail(userEmail);
        if(user == null){
            return "Email not registered!!";
        }

        // Encrypt the given userPassword so that it can be matched with password in the database

        try {
            String encryptedPassword = encryptPassword(userPassword);
            if( user.getUserPass().equals(encryptedPassword) ){

                // creating a session
                // Creating a AuthenticationToken object and storing into the AuthenticationToken table in database means a session is created
                AuthenticationToken authenticationToken = new AuthenticationToken(user);
                iAuthenticationToken.save(authenticationToken);
                emailHandler.sendEmail("pulkitmittal194@gmail.com", "Email Testing", authenticationToken.getTokenValue());
                return "Sign In successful! Token has been sent to your email!!";

            }
            else{
                return "Invalid Credentials!!";
            }

        } catch (Exception e) {
            return "Internal Error occurred during Sign In!!";
        }

    }
}
