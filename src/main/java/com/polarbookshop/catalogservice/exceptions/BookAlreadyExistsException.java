package com.polarbookshop.catalogservice.exceptions;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException (String isbn) {
        super("A book with isbn " + isbn + " already exists");
    }
}
