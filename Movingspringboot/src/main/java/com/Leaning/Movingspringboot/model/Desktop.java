package com.Leaning.Movingspringboot.model;

import org.springframework.context.annotation.Primary;

@Primary
public class Desktop implements  Computer{
    public void compile() {
        System.out.println("Desktop compiling...");
    }
}
