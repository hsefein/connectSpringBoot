package com.rocc.java.example.demo.hello.repositories;

import com.rocc.java.example.demo.hello.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins= "*")
@RepositoryRestController
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByName(@Param(value = "name") String name);

    List<User> findByEmail(@Param(value = "email") String email);

    List<User> findByNameAndEmail(@Param(value = "name") String name, @Param(value = "email") String email);

    @Query(value = "select e from User e where e.name like :name or e.email like :email")
    List<User> customFind(@Param(value = "name") String name, @Param(value = "email") String email);

}


