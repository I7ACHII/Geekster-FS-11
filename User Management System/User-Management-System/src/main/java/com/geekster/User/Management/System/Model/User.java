package com.geekster.User.Management.System.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull(message = "User Id is must required!!")
    private Long userId;

    @NotBlank(message = "Name is must required!!")
    private String name;

    @NotBlank(message = "User Name is must required!!")
    @Size(min = 2, max = 50, message = "User Name must be between 2 and 50 characters")
    private String userName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    private String Address;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^\\d{12}$", message = "Phone number must be 12 digits, first two digit for country code")
    private String phoneNo;

}
