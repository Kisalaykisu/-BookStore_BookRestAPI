package com.example.bookstore_bookrestapi.repository;

import com.example.bookstore_bookrestapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    @Query(value = "SELECT * FROM book WHERE name=:bookName", nativeQuery = true)
    Book findByBookName(String bookName);

}
