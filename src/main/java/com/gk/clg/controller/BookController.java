package com.gk.clg.controller;

import com.gk.clg.model.Book;
import com.gk.clg.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;


    @GetMapping("/getBooks")
    public ResponseEntity<List<Book>> getBooks() {
        return ResponseEntity.ok(bookService.findAll());
    }

    @GetMapping("/getBook/{id}")
    public ResponseEntity<Book> getBooks(@PathVariable int id) {
        return ResponseEntity.ok(bookService.findById(id));
    }

    @PostMapping("/addBooks")
    public ResponseEntity<Book> addBooks(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.save(book), HttpStatus.CREATED);
    }

    @PutMapping("/updateBook/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book) {
        return ResponseEntity.ok(bookService.update(id, book));
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<Boolean> deleteBook(@PathVariable int id) {
        return ResponseEntity.ok(bookService.delete(id));
    }
}
