package com.thoughworks.example;

import com.thoughworks.example.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        PersonService personService = context.getBean(PersonService.class);

        System.out.println(personService.getPersonName(1));

    }



}
