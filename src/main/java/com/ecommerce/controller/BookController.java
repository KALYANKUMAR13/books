package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Book;
import com.ecommerce.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	 @Autowired
	    private BookService bookService;
	    @GetMapping
	    public List<Book> getAllBooks() {
	        return bookService.getAllBooks();
	    }

	    @PostMapping
	    public ResponseEntity<Book> createBook(@RequestBody Book book) {
	        Book savedBook = bookService.createBook(book);
	        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
	    }
}
