package com.geekster.Restaurant_management.Model;


import com.geekster.Restaurant_management.Model.enums.UserType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String userEmail;

    @NotBlank
    private String userPass;

    private String userPhoneNo;
    private UserType userType;
}
