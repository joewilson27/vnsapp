package com.vnsapp.springbootvnsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vnsapp.springbootvnsapp.entity.Product;

//@RepositoryRestResource(path = "productku") // jika path kita ganti begini, maka kita dapat memanggil dengan http://localhost:8080/api/productku
// default http://localhost:8080/api/products
@CrossOrigin("http://localhost:4200") // to avoid cross-origin coming from frontend
public interface ProductRepository extends JpaRepository<Product, Long> {
  
}
