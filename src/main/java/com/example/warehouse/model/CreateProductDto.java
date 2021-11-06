package com.example.warehouse.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor()
public class CreateProductDto {

    @NotBlank
    @Schema(description = "id продукта", example = "31a07646-f991-407b-8937-0517dd1a8cb7")
    private UUID id;

    @NotBlank
    @Schema(description = "Наименование продукта", example = "Блок питания")
    private String name;

    @Schema(description = "Тип продукта", example = "1/2/3")
    private Integer type;

    @Schema(description = "Наименование поставщика", example = "random provider")
    private String providerName;

    @Schema(description = "Имя пользователя", example = "user")
    private String userName;

}
