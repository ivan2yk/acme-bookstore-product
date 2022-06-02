package com.acme.bookstore.acmebookstoreproduct.service;

import com.acme.bookstore.acmebookstoreproduct.domain.sql.BookEntity;
import com.acme.bookstore.acmebookstoreproduct.dto.BookDto;
import com.acme.bookstore.acmebookstoreproduct.mapper.BookEntityMapper;
import com.acme.bookstore.acmebookstoreproduct.repository.BookEntityRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private final BookEntityRepository bookRepository;
    private final BookEntityMapper bookEntityMapper = Mappers.getMapper(BookEntityMapper.class);

    public BookServiceImpl(BookEntityRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    @Override
    public void create(BookDto bookDto) {
        BookEntity bookEntity = bookEntityMapper.toBook(bookDto);
        bookRepository.save(bookEntity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<BookDto> getAll() {
        return bookRepository.findAll()
                .stream()
                .map(bookEntityMapper::toBookDto)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public void removeById(Long id) {
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(RuntimeException::new);
        bookRepository.delete(bookEntity);
    }

    @Transactional(readOnly = true)
    @Override
    public BookDto findById(Long id) {
        return bookRepository.findById(id).map(bookEntityMapper::toBookDto).orElseThrow(RuntimeException::new);
    }

    @Transactional
    @Override
    public void update(BookDto bookDto) {
        BookEntity bookEntity = bookRepository.findById(bookDto.getId()).orElseThrow(RuntimeException::new);
        BookUpdateHelper.update(bookEntity, bookDto);
    }

}
