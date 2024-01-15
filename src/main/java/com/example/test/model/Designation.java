package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Designation {
    public int getDesignation_id() {
        return designation_id;
    }

    public void setDesignation_id(int designation_id) {
        this.designation_id = designation_id;
    }

    public String getDesignation_name() {
        return designation_name;
    }

    public void setDesignation_name(String designation_name) {
        this.designation_name = designation_name;
    }

    @Id
    int designation_id;
    String designation_name;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @OneToOne(mappedBy = "address")
    private Employee employee;
}
