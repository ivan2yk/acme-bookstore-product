package com.acme.bookstore.acmebookstoreproduct.repository;

import com.acme.bookstore.acmebookstoreproduct.domain.sql.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookEntityRepository extends JpaRepository<BookEntity, Long> {

}
