package com.example.warehouse.service.impl;


import com.example.warehouse.entity.Product;
import com.example.warehouse.exceptions.ProductNotFoundException;
import com.example.warehouse.mapper.ProductMapper;
import com.example.warehouse.model.CreateProductDto;
import com.example.warehouse.model.ProductDto;
import com.example.warehouse.repository.ProductRepository;
import com.example.warehouse.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

  private final ProductRepository repository;
  private final ProductMapper productMapper;

  @Override
  @Transactional
  public ProductDto getProduct(UUID uuid) throws ProductNotFoundException {
    Product product =
            repository
            .findById(uuid)
                    .orElseThrow(() -> new ProductNotFoundException("Товара с таким uuid не существует"));
    return productMapper.INSTANCE.toDto(product);
  }

  @Override
  public UUID addProduct(CreateProductDto dto) {
    Product product = new Product();
    UUID uuid = UUID.randomUUID();
    product.setId(uuid);
    product.setName(dto.getName());
    product.setProviderName(dto.getProviderName());
    product.setUserName(dto.getUserName());
    repository.save(product);
    return uuid;
  }

  @Override
  public List<Product> getProducts() {
    return repository.findAll();
  }
}
