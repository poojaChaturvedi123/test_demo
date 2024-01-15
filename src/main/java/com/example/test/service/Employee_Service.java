package com.example.test.service;

import com.example.test.model.Employee;
import com.example.test.repository.Employee_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Employee_Service {
    @Autowired
    Employee_Repo employee_repo;
    //getting all employee record by using the method findAll() of CrudRepository
    public List<Employee> getAllEmployee()
    {
        List<Employee> employee = new ArrayList<Employee>();
        employee_repo.findAll().forEach(employee1 -> employee.add(employee1));
        return employee;
    }
    //getting a specific record by using the method findById() of CrudRepository  
    public Employee getEmployeeById(int id)
    {
        return employee_repo.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void save(Employee employee)
    {
        employee_repo.save(employee);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        employee_repo.deleteById(id);
    }
    //updating a record
    public void update(Employee employee, int employee_id)
    {
        employee_repo.save(employee);
    }

}
