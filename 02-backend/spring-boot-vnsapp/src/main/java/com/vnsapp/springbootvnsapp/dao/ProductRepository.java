package com.vnsapp.springbootvnsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.vnsapp.springbootvnsapp.entity.Product;

//@RepositoryRestResource(path = "productku") // jika path kita ganti begini, maka kita dapat memanggil dengan http://localhost:8080/api/productku
@RepositoryRestResource // by default http://localhost:8080/api/products
public interface ProductRepository extends JpaRepository<Product, Long> {
  
}
