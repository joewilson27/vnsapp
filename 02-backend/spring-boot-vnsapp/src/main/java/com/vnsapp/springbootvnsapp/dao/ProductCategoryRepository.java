package com.vnsapp.springbootvnsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.vnsapp.springbootvnsapp.entity.ProductCategory;

// this annotation is for using hybrid to the rest api and webpages
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
// notes: "productCategory" -> name of JSON entry, "product-category" -> /product-category
/**
 * Look for response rest example below, focust on productCategory
 * {
 *   "_links" : {
 *     "products" : {
 *       "href" : "http://localhost:8080/api/products{?page,size,sort}",
 *       "templated" : true
 *     },
 *     "productCategory" : {
 *       "href" : "http://localhost:8080/api/product-category{?page,size,sort}",
 *       "templated" : true
 *     },
 *     "profile" : {
 *       "href" : "http://localhost:8080/api/profile"
 *     }
 *   }
 * }
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
  
}
