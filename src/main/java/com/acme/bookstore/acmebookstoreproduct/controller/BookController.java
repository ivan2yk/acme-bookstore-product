package com.acme.bookstore.acmebookstoreproduct.controller;

import com.acme.bookstore.acmebookstoreproduct.dto.web.BookWebDto;
import com.acme.bookstore.acmebookstoreproduct.dto.web.CreateBookWebDto;
import com.acme.bookstore.acmebookstoreproduct.facade.BookFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    private final BookFacade bookFacade;

    public BookController(BookFacade bookFacade) {
        this.bookFacade = bookFacade;
    }

    @GetMapping
    public List<BookWebDto> getAll() {
        return bookFacade.getAll();
    }

    @GetMapping("/{id}")
    public BookWebDto findById(@PathVariable("id") Long id) {
        return bookFacade.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody CreateBookWebDto createBookWebDto) {
        bookFacade.create(createBookWebDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody BookWebDto bookWebDto) {
        bookWebDto.setId(id);
        bookFacade.update(bookWebDto);
    }

    @DeleteMapping("/{id}")
    public void removeById(@PathVariable("id") Long id) {
        bookFacade.removeById(id);
    }

}
