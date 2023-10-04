package com.geekster.employee_address.Service;


import com.geekster.employee_address.Model.Address;
import com.geekster.employee_address.Model.Employee;
import com.geekster.employee_address.Repository.IEmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public String addEmployee(Employee employee) {
        iEmployeeRepo.save(employee);
        return "Employee has been added!!";
    }

    public List<Employee> getAllEmployee() {
        return iEmployeeRepo.findAll();
    }


    public Optional<Employee> findEmployeeById(Long employeeId) {
        Optional<Employee> employeeById = iEmployeeRepo.findById(employeeId);
        return employeeById;
    }

    public String changeEmployee(Long employeeId, String firstName) {
        Optional<Employee> employee = iEmployeeRepo.findById(employeeId);
        Employee newEmployee = null;
        if(employee.isPresent()){
            newEmployee = employee.get();
        }
        else{
            return "Address not found!!";
        }
        newEmployee.setFirstName(firstName);
        iEmployeeRepo.save(newEmployee);
        return "Address has been added!!";
    }


    public String deleteEmployee(Long employeeId) {

        iEmployeeRepo.deleteById(employeeId);
        return "employee has been deleted!!";
    }
}
