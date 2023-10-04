package com.geekster.employee_address.Repository;


import com.geekster.employee_address.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Long> {

}
