package com.acme.bookstore.acmebookstoreproduct.service;

import com.acme.bookstore.acmebookstoreproduct.domain.sql.BookEntity;
import com.acme.bookstore.acmebookstoreproduct.dto.BookDto;

import java.util.Optional;

public class BookUpdateHelper {

    public static void update(BookEntity bookEntity, BookDto bookDto) {
        Optional.ofNullable(bookDto.getTitle()).ifPresent(bookEntity::setTitle);
        Optional.ofNullable(bookDto.getAuthor()).ifPresent(bookEntity::setAuthor);
        Optional.ofNullable(bookDto.getPublisher()).ifPresent(bookEntity::setPublisher);
        Optional.ofNullable(bookDto.getPublicationDate()).ifPresent(bookEntity::setPublicationDate);
        Optional.ofNullable(bookDto.getLanguage()).ifPresent(bookEntity::setLanguage);
        Optional.ofNullable(bookDto.getCategory()).ifPresent(bookEntity::setCategory);
        Optional.of(bookDto.getNumberOfPages()).ifPresent(bookEntity::setNumberOfPages);
        Optional.ofNullable(bookDto.getFormat()).ifPresent(bookEntity::setFormat);
        Optional.of(bookDto.getIsbn()).ifPresent(bookEntity::setIsbn);
        Optional.of(bookDto.getShippingWeight()).ifPresent(bookEntity::setShippingWeight);
        Optional.of(bookDto.getListPrice()).ifPresent(bookEntity::setListPrice);
        Optional.of(bookDto.getOurPrice()).ifPresent(bookEntity::setOurPrice);
        Optional.of(bookDto.isActive()).ifPresent(bookEntity::setActive);
        Optional.ofNullable(bookDto.getDescription()).ifPresent(bookEntity::setDescription);
        Optional.of(bookDto.getInStockNumber()).ifPresent(bookEntity::setInStockNumber);
    }

}
