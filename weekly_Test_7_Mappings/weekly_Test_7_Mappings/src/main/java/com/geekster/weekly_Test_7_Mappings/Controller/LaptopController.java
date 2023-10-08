package com.geekster.weekly_Test_7_Mappings.Controller;


import com.geekster.weekly_Test_7_Mappings.Model.Course;
import com.geekster.weekly_Test_7_Mappings.Model.Laptop;
import com.geekster.weekly_Test_7_Mappings.Service.CourseService;
import com.geekster.weekly_Test_7_Mappings.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;


    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop laptop) {
        return laptopService.addLaptop(laptop);
    }

    @GetMapping("laptop")
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @PutMapping("laptop/brand/{laptopId}/{brand}")
    public String changeTitleByLaptopId(@PathVariable Long laptopId, @PathVariable String brand) {
        return laptopService.changeTitleByLaptopId(laptopId, brand);
    }

    @DeleteMapping("laptop/{laptopId}")
    public String deleteLaptopByLaptopId(@PathVariable Long laptopId) {
        return laptopService.deleteLaptopByLaptopId(laptopId );
    }

}
