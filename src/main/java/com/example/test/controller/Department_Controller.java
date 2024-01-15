package com.example.test.controller;

import com.example.test.model.Department;
import com.example.test.model.Employee;
import com.example.test.service.Department_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Department_Controller {
    @Autowired
    Department_Service department_service;
    @GetMapping("/department")
    private List<Department> getAllEmployee()
    {
        return department_service.getAllDepartment();
    }
    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/department_get/{department_id}")
    private Department getDepartment(@PathVariable("department_id") int department_id)
    {
        return department_service.getDepartmentById(department_id);
    }
    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/department_delete/{department_id}")
    private void deleteDepartment(@PathVariable("department_id") int department_id)
    {
        department_service.delete(department_id);
    }
    //creating post mapping that post the book detail in the database
    @PostMapping("/department_post")
    private int saveDepartment(@RequestBody Department department)
    {
        department_service.save(department);
        return department.getDepartment_id();
    }
    //creating put mapping that updates the book detail
    @PutMapping("/department_put")
    private Department update(@RequestBody Department department)
    {
        department_service.save(department);
        return department;
    }

    //count employees in a department ....
    @GetMapping("/department_get_count/{department_name}")
    private Long count_employee(@PathVariable("department_name") String department_name){
        return department_service.count_employee(department_name);
    }

}
