package com.acme.bookstore.acmebookstoreproduct.dto.web;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookWebDto {

    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String publicationDate;
    private String language;
    private String category;
    private int numberOfPages;
    private String format;
    private int isbn;
    private double shippingWeight;
    private double listPrice;
    private double ourPrice;
    private boolean active;
    private String description;
    private int inStockNumber;

}
