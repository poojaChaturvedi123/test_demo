package com.example.test.model;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    int emp_id;
    String name;

    float salary;
    String creation_date;

    String password;

    //@OneToOne(mappedBy ="employee", cascade = CascadeType.ALL)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "designation_id", referencedColumnName = "designation_id")
    private Designation designation;
    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }



    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    // String address;


}
