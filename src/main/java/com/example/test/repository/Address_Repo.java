package com.example.test.repository;

import com.example.test.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface Address_Repo extends CrudRepository<Address,Integer> {
}
