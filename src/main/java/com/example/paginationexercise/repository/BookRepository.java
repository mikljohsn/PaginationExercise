package com.example.paginationexercise.repository;

import com.example.paginationexercise.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
