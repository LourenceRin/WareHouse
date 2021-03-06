package com.example.warehouse.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor()
public class CreateProductDto {

    @NotBlank
    @Schema(description = "Наименование продукта", example = "Блок питания")
    private String name;

    @Schema(description = "Наименование поставщика", example = "random provider")
    private String providerName;

    @Schema(description = "Имя пользователя", example = "user")
    private String userName;

}
