package com.example.Spring_jpa_map.controller;
import com.example.Spring_jpa_map.entities.Address;
import com.example.Spring_jpa_map.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addRepository;

    @GetMapping("/getAddress")
    public List<Address> getEmployees(){
        return addRepository.findAll();
    }
}
