package com.geekster.weekly_Test_7_Mappings.Service;

import com.geekster.weekly_Test_7_Mappings.Model.Address;
import com.geekster.weekly_Test_7_Mappings.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "Address has been added!!";
    }

    public List<Address> getAllAddresses() {
        return iAddressRepo.findAll();
    }

    public String changeLandmarkByAddressId(Long addressId, String landmark) {
        Optional<Address> address = iAddressRepo.findById(addressId);
        Address newAddress = null;
        if(address.isPresent()){
            newAddress = address.get();
        }
        else{
            return "Address not found!!";
        }
        newAddress.setLandmark(landmark);
        iAddressRepo.save(newAddress);
        return "Landmark has been changed!!";
    }

    public String deleteAddressByAddressId(Long addressId) {
        iAddressRepo.deleteById(addressId);
        return "Address has been deleted!";
    }
}
