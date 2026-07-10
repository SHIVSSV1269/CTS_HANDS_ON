package com.library.service;

import com.library.repository.BookRepository;

/**
 * Service class that depends on BookRepository.
 * Exercise 2 & 7: dependency is injected via a setter (and constructor).
 */
public class BookService {
    private BookRepository bookRepository;

    public BookService() { }

    // Constructor injection (Exercise 7)
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Setter injection (Exercise 2)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String findBook(int id) {
        return bookRepository.getBookById(id);
    }
}
