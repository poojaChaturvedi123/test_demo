package com.example.test.repository;

import com.example.test.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface Employee_Repo extends CrudRepository<Employee,Integer> {
}
