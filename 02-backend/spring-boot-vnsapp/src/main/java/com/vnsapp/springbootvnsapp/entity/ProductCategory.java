package com.vnsapp.springbootvnsapp.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product_category")
// @Data -- known bug, if you make relationship between data like OneToMany and ManyToOne, or
//  Its just sometimes @Data may not generate all the boiler-plate code for a pojo.
@Getter
@Setter
public class ProductCategory {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "category_name")
  private String categoryName;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "category") // mapped by variable category in Product entity
  private Set<Product> products;

}
