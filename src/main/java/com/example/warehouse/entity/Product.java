package com.example.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
  /** ИД подборки */
  @Id
  @GeneratedValue
  @Column(name = "id_product")
  private UUID id;

  /** Наименование подборки */
  @Column(name = "nm_product")
  private String name;

  /** Наименование подборки */
  @Column(name = "nm_provider")
  private String providerName;

  /** Наименование подборки */
  @Column(name = "user_name")
  private String userName;

}
