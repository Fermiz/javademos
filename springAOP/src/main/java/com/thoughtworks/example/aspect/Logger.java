package com.thoughtworks.example.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class Logger {

    private Map<String,Integer> counts = new HashMap<>();

    @Pointcut("execution(* com.thoughtworks.example.repo.BookRepo.borrow(..)) && args(name)")
    public void borrow(String name){}

    @Before("borrow(name)")
    public void showBooks(String name){
        System.out.println("Available Books:\n 1.Spring In Action\n 2.Test Driven Development\n" );
    }

    @AfterReturning("borrow(name)")
    public void checkout(String name){
        Integer currentCount = getBookcount(name);
        counts.put(name,currentCount + 1);
    }

    public Integer getBookcount(String name) {
        return counts.containsKey(name) ? counts.get(name) : 0;
    }




}
