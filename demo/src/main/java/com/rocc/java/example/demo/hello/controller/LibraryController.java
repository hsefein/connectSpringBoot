package com.rocc.java.example.demo.hello.controller;

import com.rocc.java.example.demo.hello.model.Library;
import com.rocc.java.example.demo.hello.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/library")
public class LibraryController
{
    @Autowired
    private LibraryRepository libraryRepository;

//    @GetMapping(path = "/add")
//    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email)
//    {
//        User n = new User();
//        n.setName(name);
//        n.setEmail(email);
//        userRepository.save(n);
//        return "saved";
//    }

    @GetMapping("/all")
    public @ResponseBody
    Iterable<Library> getAllLibraries()
    {

        return libraryRepository.findAll();
    }
}
