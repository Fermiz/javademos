package com.thoughworks.example.application;

import com.thoughworks.example.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        PersonService personService = context.getBean(PersonService.class);

        System.out.println(personService.getPersonName(101));

    }
}
