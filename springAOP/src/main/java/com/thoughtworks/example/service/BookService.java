package com.thoughtworks.example.service;

import com.thoughtworks.example.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public void borrowBook(String name) {
        bookRepo.borrow(name);
    }
}
