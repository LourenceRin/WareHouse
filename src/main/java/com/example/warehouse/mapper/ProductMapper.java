package com.example.warehouse.mapper;

import com.example.warehouse.entity.Product;
import com.example.warehouse.model.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

  ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

  ProductDto toDto(Product product);

}
