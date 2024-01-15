package com.example.test.service;

import com.example.test.model.Address;
import com.example.test.model.Employee;
import com.example.test.repository.Address_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Address_Service {
    @Autowired
    Address_Repo address_repo;
    public List<Address> getAllAddress(){
        List <Address> address= new ArrayList<Address>();
        address_repo.findAll().forEach(address1 -> address.add(address1));
        return address;
    }
    public Address getAddressById(int address_id)
    {
        return address_repo.findById(address_id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void save(Address address)
    {
        address_repo.save(address);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int address_id)
    {
        address_repo.deleteById(address_id);
    }
    //updating a record
    public void update(Address address, int address_id)
    {
        address_repo.save(address);
    }
}

