package com.ecommerce.service;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class BookService {
    
    private final List<Book> books = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Book> getAllBooks() {
        return books;
    }

    public Book createBook(Book book) {
        book.setId(counter.incrementAndGet());
        books.add(book);
        return book;
    }
}
