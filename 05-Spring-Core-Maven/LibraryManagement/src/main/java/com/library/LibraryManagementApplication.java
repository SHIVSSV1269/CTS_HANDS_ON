package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Exercise 1 & 2: Load the Spring context from applicationContext.xml,
 * obtain the BookService bean (with BookRepository injected), and use it.
 */
public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println("Dependency injection working -> " + bookService.findBook(101));

        ((ClassPathXmlApplicationContext) context).close();
    }
}
