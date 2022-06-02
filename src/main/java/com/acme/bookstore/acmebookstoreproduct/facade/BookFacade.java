package com.acme.bookstore.acmebookstoreproduct.facade;

import com.acme.bookstore.acmebookstoreproduct.dto.BookDto;
import com.acme.bookstore.acmebookstoreproduct.dto.web.BookWebDto;
import com.acme.bookstore.acmebookstoreproduct.dto.web.CreateBookWebDto;
import com.acme.bookstore.acmebookstoreproduct.mapper.BookMapper;
import com.acme.bookstore.acmebookstoreproduct.service.BookService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookFacade {

    private final BookService bookService;
    private final BookMapper bookMapper = Mappers.getMapper(BookMapper.class);

    public BookFacade(BookService bookService) {
        this.bookService = bookService;
    }

    public void create(CreateBookWebDto createBookWebDto) {
        BookDto bookDto = bookMapper.toBookDto(createBookWebDto);
        bookService.create(bookDto);
    }

    public List<BookWebDto> getAll() {
        return bookService.getAll()
                .stream()
                .map(bookMapper::toBookWebDto)
                .collect(Collectors.toList());
    }

    public void removeById(Long id) {
        bookService.removeById(id);
    }

    public BookWebDto findById(Long id) {
        return bookMapper.toBookWebDto(bookService.findById(id));
    }

    public void update(BookWebDto bookWebDto) {
        BookDto bookDto = bookMapper.toBookDto(bookWebDto);
        bookService.update(bookDto);
    }

}
