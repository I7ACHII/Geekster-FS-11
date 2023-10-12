package com.geekster.Restaurant_management.Model;


import com.geekster.Restaurant_management.Model.enums.orderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    private Integer orderQuantity;

    private orderStatus status;

    // foriegn key
    @ManyToOne
    @JoinColumn(name = "fk_foodItem_Id")
    FoodItem foodItem;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    User user;
}
