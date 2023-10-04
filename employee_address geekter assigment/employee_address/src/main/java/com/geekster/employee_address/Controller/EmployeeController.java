package com.geekster.employee_address.Controller;


import com.geekster.employee_address.Model.Employee;
import com.geekster.employee_address.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("employee")
    String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("employees")
    List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("employeeId/{employeeId}")
    Optional<Employee> findEmployeeById(@PathVariable Long employeeId){
        return employeeService.findEmployeeById(employeeId);
    }

    @PutMapping("employeeId/{employeeId}/{firstName}")
    String changeEmployee(@PathVariable Long employeeId, @PathVariable String firstName){
        return employeeService.changeEmployee(employeeId, firstName);
    }

    @DeleteMapping("employeeId/{employeeId}")
    String deleteEmployee(@PathVariable Long employeeId){
        return employeeService.deleteEmployee(employeeId);
    }
}
