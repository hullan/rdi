package com.interfaces.rdi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.interfaces.rdi.model.IntRdiIn;
import com.interfaces.rdi.repository.IntRdiInRepository;

@RestController
public class IntRdiInController {

    @Autowired
    private IntRdiInRepository intRdiInRepository;

    @GetMapping("/intRdiIn")
    List<IntRdiIn> all() {
        return intRdiInRepository.findAll();
    }

    @PostMapping("/intRdiIn")
    IntRdiIn newIntRdiIn(@RequestBody IntRdiIn newIntRdiIn) {
        return intRdiInRepository.save(newIntRdiIn);
    }

}
