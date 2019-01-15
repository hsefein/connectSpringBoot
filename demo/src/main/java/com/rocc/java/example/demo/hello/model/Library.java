package com.rocc.java.example.demo.hello.model;

import org.apache.tomcat.jni.Address;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Entity
public class Library
{
    @Id
    @GeneratedValue
    private long id;

    private String name;

//    @OneToOne
//    @JoinColumn(name = "address_id")
//    @RestResource(path = "libraryAddress", rel = "address")
    private Address address;

    // Constructor
    public Library(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Library() {}


    // getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
