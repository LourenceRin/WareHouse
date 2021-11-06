package com.example.warehouse.service;

import com.example.warehouse.exceptions.ProductNotFoundException;
import com.example.warehouse.model.ProductDto;

import java.util.UUID;

/** Сервис для работы с подборками */
public interface ProductService {
  ProductDto getProduct(UUID uuid) throws ProductNotFoundException;
}
