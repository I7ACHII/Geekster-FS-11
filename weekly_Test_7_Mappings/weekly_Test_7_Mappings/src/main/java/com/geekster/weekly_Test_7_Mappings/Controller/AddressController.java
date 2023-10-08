package com.geekster.weekly_Test_7_Mappings.Controller;

import com.geekster.weekly_Test_7_Mappings.Model.Address;
import com.geekster.weekly_Test_7_Mappings.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;


    @PostMapping("address")
    public String addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    @GetMapping("addresses")
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @PutMapping("address/landmark/{addressId}/{landmark}")
    public String changeLandmarkByAddressId(@PathVariable Long addressId, @PathVariable String landmark) {
        return addressService.changeLandmarkByAddressId(addressId, landmark);
    }

    @DeleteMapping("address/{addressId}")
    public String deleteAddressByAddressId(@PathVariable Long addressId) {
        return addressService.deleteAddressByAddressId(addressId );
    }
}
