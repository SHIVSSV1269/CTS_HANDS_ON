package com.library.repository;

/** Repository class - simulates data access for books. */
public class BookRepository {
    public String getBookById(int id) {
        return "Book#" + id + " : 'Effective Java'";
    }
}
