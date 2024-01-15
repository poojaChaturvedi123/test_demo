package com.example.test.service;

import com.example.test.model.Address;
import com.example.test.model.Department;
import com.example.test.repository.Department_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Department_Service {
    Long employee_number;
    @Autowired
    Department_Repo department_repo;
    public List<Department> getAllDepartment(){
        List <Department> department= new ArrayList<Department>();
        department_repo.findAll().forEach(department1 -> department.add(department1));
        return department;
    }
    public Department getDepartmentById(int department_id)
    {
        return department_repo.findById(department_id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void save(Department department)
    {
        department_repo.save(department);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int department_id)
    {
        department_repo.deleteById(department_id);
    }
    //updating a record
    public void update(Department department, int address_id)
    {
        department_repo.save(department);
    }
    //count employees by department name
    public Long count_employee(String department_name){
        return department_repo.Department_employee_count(department_name);
    }

    //
}

