package com.thoughtworks.example.repo;

import org.springframework.stereotype.Component;

@Component
public interface BookRepo {

    void borrow(String name);

}
