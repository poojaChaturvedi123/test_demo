package com.example.test.service;

import com.example.test.model.Department;
import com.example.test.model.Designation;
import com.example.test.repository.Designation_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Designation_Service {
    @Autowired
    Designation_Repo designation_repo;
    public List<Designation> getAllDesignation(){
        List <Designation> designation= new ArrayList<Designation>();
        designation_repo.findAll().forEach(designation1 -> designation.add(designation1));
        return designation;
    }
    public Designation getDesignationById(int designation_id)
    {
        return designation_repo.findById(designation_id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void save(Designation designation)
    {
        designation_repo.save(designation);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int designation_id)
    {
        designation_repo.deleteById(designation_id);
    }
    //updating a record
    public void update(Designation designation, int designation_id)
    {
        designation_repo.save(designation);
    }
}
