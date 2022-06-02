package com.acme.bookstore.acmebookstoreproduct.dto.web;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookWebDto {

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
    private boolean active = true;
    private String description;
    private int inStockNumber;

}
