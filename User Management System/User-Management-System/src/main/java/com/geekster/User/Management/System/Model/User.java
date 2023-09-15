package com.geekster.User.Management.System.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long userId;
    private String name;
    private String userName;
    private String Address;
    private Long phoneNo;
}
