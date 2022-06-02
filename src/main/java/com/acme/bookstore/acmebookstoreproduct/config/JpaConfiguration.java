package com.acme.bookstore.acmebookstoreproduct.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.acme.bookstore.acmebookstoreproduct.repository")
@EntityScan("com.acme.bookstore.acmebookstoreproduct.domain.sql")
public class JpaConfiguration {
}
