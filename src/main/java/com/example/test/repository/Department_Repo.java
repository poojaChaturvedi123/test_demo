package com.example.test.repository;

import com.example.test.model.Department;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Department_Repo extends CrudRepository<Department,Integer> {
   // @Query("SELECT d from Department d WHERE d.department_name=:d")
   @Query ("SELECT COUNT(d)  FROM Department d WHERE d.department_name=:d")
     public Long Department_employee_count(@Param(value="d") String department_name);

}
