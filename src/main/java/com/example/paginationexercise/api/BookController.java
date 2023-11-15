package com.example.paginationexercise.api;

import com.example.paginationexercise.entity.Book;
import com.example.paginationexercise.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Page<Book> getAllBooks(Pageable pageable) {
        System.out.println("pageable = " + pageable); //Add a breakpoint here, and investigate the pageable instance
        return bookService.getAllBooks(pageable);
    }
}

