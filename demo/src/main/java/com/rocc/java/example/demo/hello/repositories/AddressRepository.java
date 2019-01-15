package com.rocc.java.example.demo.hello.repositories;

import com.rocc.java.example.demo.hello.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(allowedHeaders = "*", origins= "*")
@RepositoryRestController
public interface AddressRepository extends CrudRepository<Address, Long> {
}
