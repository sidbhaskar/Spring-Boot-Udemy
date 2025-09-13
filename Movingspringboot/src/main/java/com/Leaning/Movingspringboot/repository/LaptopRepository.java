package com.Leaning.Movingspringboot.repository;

import com.Leaning.Movingspringboot.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in database");
    }
}
