package com.gk.clg.service;

import com.gk.clg.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book findById(int id);

    Book save(Book book);

    Boolean delete(int id);

    Book update(int id, Book book);

}
