package com.geekster.Restaurant_management.Repository;

import com.geekster.Restaurant_management.Model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationToken extends JpaRepository<AuthenticationToken, Long> {

    AuthenticationToken findFirstByTokenValue(String authToken);
}
