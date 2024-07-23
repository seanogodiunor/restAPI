package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="street")
    private String street;

    @Column(name="houseNR")
    private String houseNR;

    @Column(name="PLZ")
    private String PLZ;


    // define constructors
    public Employee() {

    }

    public Employee(int id, String firstName, String lastName, String email, String street, String houseNR, String PLZ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.street = street;
        this.houseNR = houseNR;
        this.PLZ = PLZ;
    }

    // GETTERS UND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNR() {
        return houseNR;
    }

    public void setHouseNR(String houseNR) {
        this.houseNR = houseNR;
    }

    public String getPLZ() {
        return PLZ;
    }

    public void setPLZ(String PLZ) {
        this.PLZ = PLZ;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", street='" + street + '\'' +
                ", houseNR='" + houseNR + '\'' +
                ", PLZ='" + PLZ + '\'' +
                '}';
    }
}








