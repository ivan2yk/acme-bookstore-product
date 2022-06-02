package com.acme.bookstore.acmebookstoreproduct.mapper;

import com.acme.bookstore.acmebookstoreproduct.dto.BookDto;
import com.acme.bookstore.acmebookstoreproduct.dto.web.BookWebDto;
import com.acme.bookstore.acmebookstoreproduct.dto.web.CreateBookWebDto;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {

    BookDto toBookDto(CreateBookWebDto createBookWebDto);

    BookDto toBookDto(BookWebDto bookWebDto);

    BookWebDto toBookWebDto(BookDto bookDto);

}
