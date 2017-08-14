package com.thoughtworks.example.application;

import com.thoughtworks.example.config.WebConfig;
import com.thoughtworks.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);

        BookService bookService = context.getBean(BookService.class);

        bookService.borrowBook("Spring In Action");
    }
}
