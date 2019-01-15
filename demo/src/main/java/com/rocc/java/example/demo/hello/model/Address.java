package com.rocc.java.example.demo.hello.model;

import org.apache.tomcat.jni.Library;

import javax.persistence.*;

@Entity
public class Address
{
    @Id
    @GeneratedValue
    private long id;

//    @Column(nullable = false)
    private String location;

//    @OneToOne(mappedBy = "address")
    private Library library;

    public Address() {}


    public Address(String location, Library library) {
        this.location = location;
        this.library = library;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", library=" + library +
                '}';
    }

}
