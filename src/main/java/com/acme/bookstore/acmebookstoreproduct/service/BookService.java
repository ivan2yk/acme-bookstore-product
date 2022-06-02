package com.acme.bookstore.acmebookstoreproduct.service;

import com.acme.bookstore.acmebookstoreproduct.dto.BookDto;

import java.util.List;

public interface BookService {

    void create(BookDto bookDto);

    List<BookDto> getAll();

    void removeById(Long id);

    BookDto findById(Long id);

    void update(BookDto bookDto);

}
