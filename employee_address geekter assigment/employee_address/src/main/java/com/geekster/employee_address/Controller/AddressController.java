package com.geekster.employee_address.Controller;


import com.geekster.employee_address.Model.Address;
import com.geekster.employee_address.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;



    @PostMapping("address")
    String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @GetMapping("addresses")
    List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("addressId/{addressId}")
    Optional<Address> findAddressById(@PathVariable Long addressId){
        return addressService.findAddressById(addressId);
    }

    @PutMapping("addressId/{addressId}/{state}")
    String changeAddress(@PathVariable Long addressId, @PathVariable String state){
        return addressService.changeAddress(addressId, state);
    }

    @DeleteMapping("addressId/{addressId}")
    String deleteAddress(@PathVariable Long addressId){
        return addressService.deleteAddress(addressId);
    }
}
