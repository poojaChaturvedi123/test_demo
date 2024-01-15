package com.example.test.controller;

import com.example.test.model.Address;
import com.example.test.model.Employee;
import com.example.test.service.Address_Service;
import com.example.test.service.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Address_Controller {
    @Autowired
    Address_Service address_service;
    @GetMapping("/address")
    private List<Address>getAllAddress()
    {
        return address_service.getAllAddress();
    }
    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/address_get/{address_id}")
    private Address getAddress(@PathVariable("address_id") int address_id)
    {
        return address_service.getAddressById(address_id);
    }
    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/address_delete/{address_id}")
    private void deleteAddress(@PathVariable("address_id") int address_id)
    {
        address_service.delete(address_id);
    }
    //creating post mapping that post the book detail in the database
    @PostMapping("/address_post")
    private int saveAddress(@RequestBody Address address)
    {
        address_service.save(address);
        return address.getAddress_id();
    }
    //creating put mapping that updates the book detail
    @PutMapping("/address_put")
    private Address update(@RequestBody Address address)
    {
        address_service.save(address);
        return address;
    }
}

