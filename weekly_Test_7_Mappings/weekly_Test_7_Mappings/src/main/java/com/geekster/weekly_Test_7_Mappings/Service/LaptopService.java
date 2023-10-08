package com.geekster.weekly_Test_7_Mappings.Service;

import com.geekster.weekly_Test_7_Mappings.Model.Course;
import com.geekster.weekly_Test_7_Mappings.Model.Laptop;
import com.geekster.weekly_Test_7_Mappings.Repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class LaptopService {

    @Autowired
    ILaptopRepo iLaptopRepo;

    public String addLaptop(Laptop laptop) {
        iLaptopRepo.save(laptop);
        return "Laptop has been added!!";
    }

    public List<Laptop> getAllLaptops() {
        return iLaptopRepo.findAll();
    }

    public String changeTitleByLaptopId(Long laptopId, String brand) {
        Optional<Laptop> laptop = iLaptopRepo.findById(laptopId);
        Laptop newLaptop = null;
        if(laptop.isPresent()){
            newLaptop = laptop.get();
        }
        else{
            return "Laptop not found!!";
        }
        newLaptop.setLaptopBrand(brand);
        iLaptopRepo.save(newLaptop);
        return "Brand has been changed!!";
    }

    public String deleteLaptopByLaptopId(Long laptopId) {
        iLaptopRepo.deleteById(laptopId);
        return "Laptop has been deleted!";
    }
}
