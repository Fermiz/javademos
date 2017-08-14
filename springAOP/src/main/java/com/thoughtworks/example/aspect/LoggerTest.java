package com.thoughtworks.example.aspect;

import com.thoughtworks.example.config.WebConfig;
import com.thoughtworks.example.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= WebConfig.class)
public class LoggerTest {

    @Autowired
    private BookService bookService;

    @Autowired
    private Logger logger;

    @Test
    public void testCounts(){
        bookService.borrowBook("Spring In Action");
        bookService.borrowBook("Test Driven Development");

        assertEquals( "1",logger.getBookcount("\"Spring In Action\"").toString());
    }
}
