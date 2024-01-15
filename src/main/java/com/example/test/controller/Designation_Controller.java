package com.example.test.controller;

import com.example.test.model.Department;
import com.example.test.model.Designation;
import com.example.test.service.Designation_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Designation_Controller {
    @Autowired
    Designation_Service designation_service;
    @GetMapping("/designation")
    private List<Designation> getAllEmployee()
    {
        return designation_service.getAllDesignation();
    }
    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/designation_get/{designation_id}")
    private Designation getdesignation(@PathVariable("designation_id") int designation_id)
    {
        return designation_service.getDesignationById(designation_id);
    }
    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/designation_delete/{designation_id}")
    private void deleteDesignation(@PathVariable("designation_id") int designation_id)
    {
        designation_service.delete(designation_id);
    }
    //creating post mapping that post the book detail in the database
    @PostMapping("/designation_post")
    private int saveDesignation(@RequestBody Designation designation)
    {
        designation_service.save(designation);
        return designation.getDesignation_id();
    }
    //creating put mapping that updates the book detail
    @PutMapping("/designation_put")
    private Designation update(@RequestBody Designation designation)
    {
        designation_service.save(designation);
        return designation;
    }
}
