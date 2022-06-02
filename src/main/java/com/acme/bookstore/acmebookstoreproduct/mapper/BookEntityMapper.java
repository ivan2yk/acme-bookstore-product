package com.acme.bookstore.acmebookstoreproduct.mapper;

import com.acme.bookstore.acmebookstoreproduct.domain.sql.BookEntity;
import com.acme.bookstore.acmebookstoreproduct.dto.BookDto;
import org.mapstruct.Mapper;

@Mapper
public interface BookEntityMapper {

    BookEntity toBook(BookDto bookDto);

    BookDto toBookDto(BookEntity bookEntity);

}
