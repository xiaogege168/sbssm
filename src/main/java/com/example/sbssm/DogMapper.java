package com.example.sbssm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DogMapper {
    public List<Dog> getAllDog();
}