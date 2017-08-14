package com.thoughtworks.example.repo;

import org.springframework.stereotype.Component;

@Component
public class BookRepoIml implements BookRepo{

    @Override
    public void borrow(String name){
        System.out.println("Borrowed <" + name + ">");
    }
}
