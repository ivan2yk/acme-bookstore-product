package com.acme.bookstore.acmebookstoreproduct.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
@RequestMapping(produces = "application/json")
public class WebExceptionHandler {



}
