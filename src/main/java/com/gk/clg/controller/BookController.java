package com.gk.clg.controller;

import com.gk.clg.model.Book;
import com.gk.clg.repo.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/getBook/{id}")
    public Book getBooks(@PathVariable int id) {
        return bookRepository.findById(id).map(book -> Objects.requireNonNullElseGet(book, Book::new)).orElse(new Book());
    }


    @PostMapping("/addBooks")
    public Book addBooks(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
