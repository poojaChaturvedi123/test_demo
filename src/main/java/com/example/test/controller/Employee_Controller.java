package com.example.test.controller;

import com.example.test.model.Employee;
import com.example.test.service.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employee_Controller {
    @Autowired
    Employee_Service employee_service;
    @GetMapping("/employee")
    private List<Employee> getAllEmployee()
    {
        return employee_service.getAllEmployee();
    }
    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/employee_get/{employee_id}")
    private Employee getEmployee(@PathVariable("employee_id") int employee_id)
    {
        return employee_service.getEmployeeById(employee_id);
    }
    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/employee_delete/{employee_id}")
    private void deleteEmployee(@PathVariable("employee_id") int employee_id)
    {
        employee_service.delete(employee_id);
    }
    //creating post mapping that post the book detail in the database
    @PostMapping("/employee_post")
    private int saveEmployee(@RequestBody Employee employee)
    {
        employee_service.save(employee);
        return employee.getEmp_id();
    }
    //creating put mapping that updates the book detail
    @PutMapping("/employee_put")
    private Employee update(@RequestBody Employee employee)
    {
        employee_service.save(employee);
        return employee;
    }
}

