package com.geekster.Best_Restaurant_Application.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    private Long restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantNumber;
    private String restaurantSpeciality;
    private Integer restaurantTotalStaff;
    private Integer restaurantRating;

}
