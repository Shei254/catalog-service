package com.polarbookshop.catalogservice.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException (String isbn) {
        super("Book with isbn " + isbn + " does not exists");
    }
}
