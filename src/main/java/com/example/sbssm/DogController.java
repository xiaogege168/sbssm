package com.example.sbssm;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DogController {
    @Resource
    private DogService dogService;
    @RequestMapping("/getAllDog")
    public List<Dog> getAllDog() {

        List<Dog> dogs = dogService.getAllDog();
        return dogs;
    }
}