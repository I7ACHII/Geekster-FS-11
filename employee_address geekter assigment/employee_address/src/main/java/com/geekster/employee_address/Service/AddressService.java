package com.geekster.employee_address.Service;


import com.geekster.employee_address.Model.Address;
import com.geekster.employee_address.Repository.IAddressRepo;
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

    public List<Address> getAllAddress() {
        return iAddressRepo.findAll();
    }

    public Optional<Address> findAddressById(Long addressId) {
        Optional<Address> addressById = iAddressRepo.findById(addressId);
        return addressById;
    }

    public String changeAddress(Long addressId, String state) {
        Optional<Address> address = iAddressRepo.findById(addressId);
        Address newAddress = null;
        if(address.isPresent()){
            newAddress = address.get();
        }
        else{
            return "Address not found!!";
        }
        newAddress.setAddressState(state);
        iAddressRepo.save(newAddress);
        return "Address has been added!!";
    }


    public String deleteAddress(Long addressId) {
        iAddressRepo.deleteById(addressId);
        return "Address has been deleted!";

//        Optional<Address> address = iAddressRepo.findById(addressId);
//        if(address != null){
//            addressList.remove(address);
//            iAddressRepo.saveAll(addressList);
//        }

    }
}
