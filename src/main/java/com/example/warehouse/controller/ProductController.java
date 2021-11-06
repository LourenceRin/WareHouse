package com.example.warehouse.controller;

import com.example.warehouse.exceptions.ProductNotFoundException;
import com.example.warehouse.model.ProductDto;
import com.example.warehouse.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/** Контроллер для работы с подборками */
@RequiredArgsConstructor
@RestController
@Validated
public class ProductController {

    private final ProductService productService;

    @Operation(summary = "Вывод продуктов")
    @GetMapping("/product/{id}")
    public ProductDto getProduct(@RequestParam UUID id) throws ProductNotFoundException {
        return productService.getProduct(id);
    }
}
