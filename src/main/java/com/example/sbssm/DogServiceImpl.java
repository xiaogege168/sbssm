package com.example.sbssm;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DogServiceImpl implements DogService {
    @Resource
    private DogMapper dogMapper;

    public List<Dog> getAllDog() {
        return   dogMapper.getAllDog();
    }

}