package com.gk.clg.service;

import com.gk.clg.model.Book;
import com.gk.clg.repo.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Cacheable("book")
    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Boolean delete(int id) {
        bookRepository.deleteById(id);
        return true;
    }

    @Override
    public Book update(int id, Book book) {
        return bookRepository.save(book);
    }
}
