package com.example.warehouse.exceptions;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
