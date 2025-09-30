package com.SpringBootCRUD.SpringBootCRUD.Service;

import java.util.List;
import java.util.Optional;

import com.SpringBootCRUD.SpringBootCRUD.Model.Employee;



public interface IEmployeeService {

    Employee save(Employee employee);

    Optional<Employee> findById(int empId);

    List<Employee> findAll();

    Employee update(Employee employee);

    void deleteById(int empId);
}