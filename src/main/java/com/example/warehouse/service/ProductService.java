package com.example.warehouse.service;

import com.example.warehouse.entity.Product;
import com.example.warehouse.exceptions.ProductNotFoundException;
import com.example.warehouse.model.CreateProductDto;
import com.example.warehouse.model.ProductDto;

import java.util.List;
import java.util.UUID;

/** Сервис для работы с подборками */
public interface ProductService {
  ProductDto getProduct(UUID uuid) throws ProductNotFoundException;

  UUID addProduct(CreateProductDto dto);

  List<Product> getProducts();
}
